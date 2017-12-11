package org.eop.spring.boot.filter;

import org.apache.catalina.filters.RemoteIpFilter;
import org.eop.spring.boot.filter.scan.MyFilter2;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lixinjie
 * @since 2017-09-20
 */
@ServletComponentScan(basePackages = {"org.eop.spring.boot.filter.scan"})
@Configuration
public class HelloApplication {

	//过滤器会自动被添加进去
	@Bean
	public RemoteIpFilter remoteIpFilter() {
		return new RemoteIpFilter();
	}
	
	//自动添加进去
	@Bean
	public MyFilter1 myFilter1() {
		return new MyFilter1();
	}
	
	//对过滤器进行配置
	@Bean
	public FilterRegistrationBean myFilter1Register(MyFilter1 myFilter1) {
		FilterRegistrationBean register = new FilterRegistrationBean(myFilter1);
		//设置顺序
		register.setOrder(0);
		//设置是否启用
		register.setEnabled(true);
		//设置初始化参数
		register.setInitParameters(null);
		//设置是否支持异步
		register.setAsyncSupported(true);
		//可以按servlet名称进行过滤
		register.setServletNames(null);
		//可以按路径进行过滤
		register.setUrlPatterns(null);
		//具体可以参考源码
		return register;
	}
	
	//对过滤器进行配置
	@Bean
	public FilterRegistrationBean myFilter2Register(MyFilter2 myFilter2) {
		FilterRegistrationBean register = new FilterRegistrationBean(myFilter2);
		//参照上面进行配置
		return register;
	}
}