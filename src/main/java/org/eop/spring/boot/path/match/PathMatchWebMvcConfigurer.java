package org.eop.spring.boot.path.match;

import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author lixinjie
 * @since 2017-09-20
 */
public class PathMatchWebMvcConfigurer extends WebMvcConfigurerAdapter {

	@Override
	public void configurePathMatch(PathMatchConfigurer configurer) {
					//不识别路径中的.*后缀
		configurer.setUseSuffixPatternMatch(Boolean.FALSE)
					//忽略路径中尾部的斜线
				  .setUseTrailingSlashMatch(Boolean.TRUE);
	}
}
