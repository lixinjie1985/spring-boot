package org.eop.spring.boot.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloApplication {

	//@ConfigurationProperties标注在@Bean方法上
	//该bean同样会从Environment中配置，并被注册
	//可以像普通bean一样被使用
	@ConfigurationProperties(prefix = "bar")
	@Bean
	public FooProperties fooProperties() {
		return new FooProperties();
	}
	
	public static class FooProperties {
		
	}
}