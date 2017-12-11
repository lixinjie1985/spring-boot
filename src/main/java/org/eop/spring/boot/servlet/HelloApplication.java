package org.eop.spring.boot.servlet;

import org.eop.spring.boot.servlet.scan.MyServlet2;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lixinjie
 * @since 2017-12-11
 */
@ServletComponentScan(basePackages = {"org.eop.spring.boot.servlet.scan"})
@Configuration
public class HelloApplication {

	//自动被注册
	@Bean
	public MyServlet1 myServlet1() {
		return new MyServlet1();
	}
	
	//对Servlet进行配置
	@Bean
	public ServletRegistrationBean myServlet1Register(MyServlet1 myServlet1) {
		ServletRegistrationBean register = new ServletRegistrationBean(myServlet1);
		//设置映射路径
		register.setUrlMappings(null);
		//设置启动
		register.setLoadOnStartup(0);
		//设置文件上传
		register.setMultipartConfig(null);
		//具体可以参考源码
		return register;
	}
	
	//对Servlet进行配置
	@Bean
	public ServletRegistrationBean myServlet2Register(MyServlet2 myServlet2) {
		ServletRegistrationBean register = new ServletRegistrationBean(myServlet2);
		//参考上面进行配置
		return register;
	}
}
