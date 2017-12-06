package org.eop.spring.boot.http.message.converter;

import java.nio.charset.Charset;
import java.util.List;

import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author lixinjie
 * @since 2017-09-19
 */
public class HttpMessageConverterConfigurer extends WebMvcConfigurerAdapter {

	//这种方法可以
	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		converters.add(new StringHttpMessageConverter(Charset.forName("UTF-8")));
	}
	
	//这种方法也可以
	@Override
	public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
		converters.clear();
		converters.add(new StringHttpMessageConverter(Charset.forName("UTF-8")));
	}
}
