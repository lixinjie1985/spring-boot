package org.eop.spring.boot.http.message.converter;

import java.nio.charset.Charset;

import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
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
	
	//任何容器中目前存在的HttpMessageConverter，都会被添加到这个列表中
	//还可以自己同时添加多个HttpMessageConverter<?>
	//这种方式还可以重写默认的HttpMessageConverter
	@Bean
	public HttpMessageConverters converters() {
		HttpMessageConverter<?> converter1 = null;
		HttpMessageConverter<?> converter2 = null;
		return new HttpMessageConverters(converter1, converter2);
	}
}
