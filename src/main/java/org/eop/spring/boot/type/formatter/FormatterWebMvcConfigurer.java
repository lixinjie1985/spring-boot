package org.eop.spring.boot.type.formatter;

import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author lixinjie
 * @since 2017-09-20
 */
public class FormatterWebMvcConfigurer extends WebMvcConfigurerAdapter {

	//添加formatter
	//线程安全
	@Override
	public void addFormatters(FormatterRegistry registry) {
		registry.addFormatter(new BookFormatter());
	}
}
