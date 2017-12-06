package org.eop.spring.boot.resource.mapping;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author lixinjie
 * @since 2017-09-20
 */
public class ResourceMappingWebMvcConfigurer extends WebMvcConfigurerAdapter {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
					//将这个路径
		registry.addResourceHandler("/internal/**")
					//映射为这个路径
				.addResourceLocations("classpath:/");
	}
}
