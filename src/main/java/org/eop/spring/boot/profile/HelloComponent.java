package org.eop.spring.boot.profile;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class HelloComponent {
	//@Profile放到方法上
	//该类里面的部分组件会随着相应的profile被激活而被注册
	
	@Bean
	@Profile("prod")
	public DataSource prodDataSource() {
		return null;
	}
	
	@Bean
	@Profile("test")
	public DataSource testDataSource() {
		return null;
	}
}
