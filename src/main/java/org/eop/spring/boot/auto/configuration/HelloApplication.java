package org.eop.spring.boot.auto.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lixinjie
 * @since 2017-09-20
 */
@Configuration
//存在是执行
@ConditionalOnClass
//不存在时执行
@ConditionalOnMissingClass
public class HelloApplication {

	@Bean
	//存在时执行
	@ConditionalOnBean
	//不存在时执行
	@ConditionalOnMissingBean
	public Object object() {
		return new Object();
	}
}
