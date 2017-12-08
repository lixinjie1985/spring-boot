package org.eop.spring.boot.jackson.objectmapper;

import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
public class Jackson2ObjectMapperBean {

	//ObjectMapper是由Jackson2ObjectMapperBuilder产生的
	//Jackson2ObjectMapperBuilder可以由Jackson2ObjectMapperBuilderCustomizer来自定义
	//ObjectMapper配上@Bean和@Primary，替换默认的ObjectMapper
	//Jackson2ObjectMapperBuilder配上@Bean，替换默认的Jackson2ObjectMapperBuilder
	//MappingJackson2HttpMessageConverter配上@Beans，替换默认的MappingJackson2HttpMessageConverter
	//HttpMessageConverters可以用来方面配置
	
	//对默认的Jackson2ObjectMapperBuilder进行自定义
	@Bean
	public Jackson2ObjectMapperBuilderCustomizer customizer() {
		return new Jackson2ObjectMapperBuilderCustomizer() {

			@Override
			public void customize(Jackson2ObjectMapperBuilder jacksonObjectMapperBuilder) {
				
			}};
	}
	
	//替换默认的Jackson2ObjectMapperBuilder
	@Bean
	public Jackson2ObjectMapperBuilder builder() {
		return new Jackson2ObjectMapperBuilder();
	}
	
	//替换默认的ObjectMapper
	@Primary
	@Bean
	public ObjectMapper mapper() {
		return new ObjectMapper();
	}
	
	//替换默认的MappingJackson2HttpMessageConverter
	@Bean
	public MappingJackson2HttpMessageConverter converter() {
		return new MappingJackson2HttpMessageConverter();
	}
	
	//同时替换多个默认的HttpMessageConverter<?>
	@Bean
	public HttpMessageConverters converters() {
		HttpMessageConverter<?> converter1 = null;
		HttpMessageConverter<?> converter2 = null;
		return new HttpMessageConverters(converter1, converter2);
	}
}
