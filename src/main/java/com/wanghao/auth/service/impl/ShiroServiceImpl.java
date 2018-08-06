package com.wanghao.auth.service.impl;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.filter.mgt.DefaultFilterChainManager;
import org.apache.shiro.web.filter.mgt.PathMatchingFilterChainResolver;
import org.apache.shiro.web.servlet.AbstractShiroFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wanghao.auth.mapper.mysql.UniCamelMapper;
import com.wanghao.auth.service.ShiroService;

@Service
public class ShiroServiceImpl implements ShiroService{
	
	@Autowired
    UniCamelMapper uniCamelMapper;

	@Autowired
	ShiroFilterFactoryBean shiroFilterFactoryBean;

	/**
	 * 初始化权限
	 */
	@Override
	public Map<String, String> loadFilterChainDefinitions() {
		// 权限控制map.从数据库获取
		Map<String, String> filterChainDefinitionMap = new LinkedHashMap<String, String>();
		List<HashMap<String,Object>> list = uniCamelMapper.getAllResourcesList();
		for (HashMap<String,Object> map : list) {
			filterChainDefinitionMap.put(map.get("resourcesUrl")+"","perms["+map.get("resourcesName")+"]");
		}
		filterChainDefinitionMap.put("/static/**", "anon");
		filterChainDefinitionMap.put("/druid/**", "anon");
		filterChainDefinitionMap.put("/ajaxLogin", "anon");//anon 可以理解为不拦截
		filterChainDefinitionMap.put("/**",  "authc");//其他资源全部拦截authc  
		return filterChainDefinitionMap;
	}

	/**
	 * 重新加载权限
	 */
	@Override
	public void updatePermission() {
		synchronized (shiroFilterFactoryBean) {
			AbstractShiroFilter shiroFilter = null;
			try {
				shiroFilter = (AbstractShiroFilter) shiroFilterFactoryBean
						.getObject();
			} catch (Exception e) {
				throw new RuntimeException("get ShiroFilter from shiroFilterFactoryBean error!");
			}
			PathMatchingFilterChainResolver filterChainResolver = (PathMatchingFilterChainResolver) shiroFilter
					.getFilterChainResolver();
			DefaultFilterChainManager manager = (DefaultFilterChainManager) filterChainResolver
					.getFilterChainManager();
			// 清空老的权限控制
			manager.getFilterChains().clear();
			shiroFilterFactoryBean.getFilterChainDefinitionMap().clear();
			shiroFilterFactoryBean.setFilterChainDefinitionMap(loadFilterChainDefinitions());
			// 重新构建生成
			Map<String, String> chains = shiroFilterFactoryBean
					.getFilterChainDefinitionMap();
			for (Map.Entry<String, String> entry : chains.entrySet()) {
				String url = entry.getKey();
				String chainDefinition = entry.getValue().trim()
						.replace(" ", "");
				if("".equals(url) || "".equals(chainDefinition)) {
					continue;
				}
				manager.createChain(url, chainDefinition);
			}
			System.out.println("更新权限成功！！");
		}
	}
	

	
}
