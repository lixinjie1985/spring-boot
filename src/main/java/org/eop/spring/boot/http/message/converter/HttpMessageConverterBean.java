package org.eop.spring.boot.http.message.converter;

import java.nio.charset.Charset;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.StringHttpMessageConverter;

/**
 * @author lixinjie
 * @since 2017-09-19
 */
@Configuration
public class HttpMessageConverterBean {

	//会自动添加进去
	@Bean
	public StringHttpMessageConverter stringHttpMessageConverter() {
		return new StringHttpMessageConverter(Charset.forName("UTF-8"));
	}
}
