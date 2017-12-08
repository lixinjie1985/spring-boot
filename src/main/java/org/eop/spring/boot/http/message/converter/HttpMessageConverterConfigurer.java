package org.eop.spring.boot.http.message.converter;

import java.nio.charset.Charset;
import java.util.List;

import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author lixinjie
 * @since 2017-09-19
 */
public class HttpMessageConverterConfigurer extends WebMvcConfigurerAdapter {

	//这种方法可以
	//在spring boot中使用这种方法只能提供额外的converter
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
	
	//加上@EnableWebMvc后，可以使用WebMvcConfigurationSupport类的getMessageConverters
	//获取所有的converter，可以自行进行操作
}
