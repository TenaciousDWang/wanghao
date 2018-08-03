package com.wanghao.config;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/** 
 * @author 作者: wh 
 * @date 创建时间: 2018年8月22日 下午2:56:12 
 * @version 版本: 1.0 
 * 权限配置模块集成
*/

@org.springframework.context.annotation.Configuration
public class Configuration extends WebMvcConfigurationSupport{
/*    @Autowired  
    MyInterceptor myInterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {

		registry.addInterceptor(myInterceptor)
		        .addPathPatterns("/**")
		        .excludePathPatterns("/static/**"
		        		            ,"/error"
		        		            ,"/login"
		        		            ,"/loginVerify"
		        		            ,"/admin/**");
	}*/
		
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }
    
}
