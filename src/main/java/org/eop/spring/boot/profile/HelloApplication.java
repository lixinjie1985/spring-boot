package org.eop.spring.boot.profile;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.ConfigurableEnvironment;

@Configuration
@Profile("production")
public class HelloApplication {
	//@Profile放到类上
	//该类里面的组件都会随着production被激活而被注册
	
	@SuppressWarnings("null")
	public static void main(String[] args) {
		SpringApplication sa = new SpringApplication();
		//设置额外的profile，spring.profiles.include=
		sa.setAdditionalProfiles("proddb", "prodmq");
		ConfigurableEnvironment ce = null;
		//激活profile，spring.profiles.active=dev,hsqldb
		ce.setActiveProfiles("production", "");
		//添加一个profile到当前激活的profile中
		ce.addActiveProfile("");
		//当没有profile被显式激活时使用默认的spring.profiles.default=
		ce.setDefaultProfiles("", "");
	}
}
