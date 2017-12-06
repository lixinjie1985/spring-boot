package org.eop.spring.boot.filter;

import org.apache.catalina.filters.RemoteIpFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lixinjie
 * @since 2017-09-20
 */
@Configuration
public class HelloApplication {

	//过滤器会自动被添加进去
	@Bean
	public RemoteIpFilter remoteIpFilter() {
		return new RemoteIpFilter();
	}
}
