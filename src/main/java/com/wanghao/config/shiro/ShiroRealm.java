package com.wanghao.config.shiro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.shiro.authc.AccountException;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.wanghao.auth.entity.UniCamelUser;
import com.wanghao.auth.entity.UniCamelUserExample;
import com.wanghao.auth.mapper.mysql.UniCamelMapper;
import com.wanghao.auth.mapper.mysql.UniCamelUserMapper;


/**
 * 获取用户的角色和权限信息
 * Created by bamboo on 2017/5/10.
 */
public class ShiroRealm extends AuthorizingRealm {

    //一般这里都写的是servic，我省略了service的接口和实现方法直接调用的dao
    @Autowired
    private UniCamelUserMapper uUserDao;
    @Autowired
    private UniCamelMapper uniCamelMapper;

    /**
     * 登录认证
     *
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        System.out.println("验证当前Subject时获取到token为：" + token.toString());
        UniCamelUser hasUser = null;
        //查出是否有此用户
        UniCamelUserExample uniCamelUserExample=new UniCamelUserExample();
        uniCamelUserExample.createCriteria().andLoginIdEqualTo(token.getUsername());
        List<UniCamelUser> list = uUserDao.selectByExample(uniCamelUserExample);
        if(list.size()>0) {
        	hasUser = list.get(0);
        }else {
        	throw new AccountException("帐号或密码不正确！");
        }
        if (hasUser == null) {
        	throw new AccountException("帐号或密码不正确！");    
        }else if(hasUser.getState().equals("0")) {
    		/**
    		 * 如果用户的status为禁用。那么就抛出<code>DisabledAccountException</code>
    		 */
    		throw new DisabledAccountException("帐号已经禁止登录！");
        }
        //若存在，将此用户存放到登录认证info中，无需自己做密码对比，Shiro会为我们进行密码对比校验
        return new SimpleAuthenticationInfo(hasUser, hasUser.getPassword(), getName());
    }

    /**
     * 权限认证
     *
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
    	System.out.println("##################执行Shiro权限认证##################");
        //获取当前登录输入的用户名，等价于(String) principalCollection.fromRealm(getName()).iterator().next();
        //String loginName = (String) super.getAvailablePrincipal(principalCollection);
        UniCamelUser user = (UniCamelUser) principalCollection.getPrimaryPrincipal();
        //到数据库查是否有此对象
        //User user = null;// 实际项目中，这里可以根据实际情况做缓存，如果不做，Shiro自己也是有时间间隔机制，2分钟内不会重复执行该方法
        //user = userMapper.findByName(loginName);
        if (user != null) {
            //权限信息对象info,用来存放查出的用户的所有的角色（role）及权限（permission）
        	SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        	HashMap<String,Object> condition = new HashMap<String,Object>();
        	condition.put("userId", user.getUserId());
            List<HashMap<String,Object>> uniCamelUserRoleList = uniCamelMapper.getUserRoleNameList(condition);
            List<HashMap<String,Object>> uniCamelUserResourcesList = uniCamelMapper.getUserResourcesNameList(condition);
            
            List<String> roleStrlist=new ArrayList<String>();////用户的角色集合
            List<String> perminsStrlist=new ArrayList<String>();//用户的权限集合
            for (HashMap<String,Object> map : uniCamelUserRoleList) {
                roleStrlist.add((String)map.get("roleName"));
            }
            for (HashMap<String,Object> map : uniCamelUserResourcesList) {
                perminsStrlist.add((String)map.get("resourcesName"));
            }
            
            //用户的角色集合
            info.addRoles(roleStrlist); 
            //用户的权限集合
            info.addStringPermissions(perminsStrlist); 

            return info;
        }
        // 返回null的话，就会导致任何用户访问被拦截的请求时，都会自动跳转到unauthorizedUrl指定的地址
        return null;
    }


}
