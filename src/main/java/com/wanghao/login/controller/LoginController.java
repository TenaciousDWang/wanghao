package com.wanghao.login.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	
    @GetMapping("/")
    public String index(Model model){
        
        return "/bootstrapCalendar/bootstrapCalendar-index";
    }
	
	@RequestMapping("/login")
	public String toLogin() {
		return "admin/login";
	}
	
	
/*    @PostMapping("/loginVerify")
    public String loginVerify(HttpServletRequest request,HttpSession session){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        boolean verify = false;
        if("wanghao".equals(username) && "123456".equals(password)) {
        	verify = true;
        }       
        if (verify) {
            session.setAttribute("userId", "wanghao");
            return "wangeditor3/editor";
        } else {
            return "admin/login";
        }
    }*/
    
    //登陆验证，这里方便url测试，正式上线需要使用POST方式提交
    @RequestMapping(value = "ajaxLogin", method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> submitLogin(String username, String password) {
    	Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        if (username != null && password != null) {
            UsernamePasswordToken token = new UsernamePasswordToken(username, password, "login");
            Subject currentUser = SecurityUtils.getSubject();
            System.out.println("对用户[" + username + "]进行登录验证..验证开始");
            try {
                currentUser.login( token );
                //验证是否登录成功
                if (currentUser.isAuthenticated()) {
            		resultMap.put("status", 200);
            		resultMap.put("message", "登录成功");
                	System.out.println("用户[" + username + "]登录认证通过(这里可以进行一些认证通过后的一些系统参数初始化操作)");
                	return resultMap;
                } else {
                    token.clear();
                    resultMap.put("message", "登录认证失败,重新登陆");
                    System.out.println("用户[" + username + "]登录认证失败,重新登陆");
                    return resultMap;
                }
            } catch ( UnknownAccountException uae ) {
            	resultMap.put("message", "用户名不存在");
            	System.out.println("对用户[" + username + "]进行登录验证..验证失败-username wasn't in the system");
            } catch ( IncorrectCredentialsException ice ) {
            	resultMap.put("message", "用户名或密码错误");
            	System.out.println("对用户[" + username + "]进行登录验证..验证失败-password didn't match");
            } catch ( LockedAccountException lae ) {
            	resultMap.put("message", "用户名或密码错误");
            	System.out.println("对用户[" + username + "]进行登录验证..验证失败-account is locked in the system");
            } catch ( AuthenticationException ae ) {
        		resultMap.put("status", 500);
        		resultMap.put("message", ae.getMessage());
            }
        }
        return resultMap;
    }
    
    /**
    * 退出
     * @return
     */
    @RequestMapping(value="logout",method =RequestMethod.GET)
    public String logout(){
    	try {
    		//退出
    		SecurityUtils.getSubject().logout();
    	} catch (Exception e) {
    		System.err.println(e.getMessage());
    	}
    	return "admin/login";
    }

}