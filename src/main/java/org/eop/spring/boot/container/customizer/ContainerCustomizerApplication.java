package org.eop.spring.boot.container.customizer;

import java.util.concurrent.TimeUnit;

import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lixinjie
 * @since 2017-09-20
 */
@Configuration
public class ContainerCustomizerApplication {

	@Bean
	public EmbeddedServletContainerCustomizer embeddedServletContainerCustomizer() {
		return new EmbeddedServletContainerCustomizer() {
			//对servlet容器进行各种配置
			@Override
			public void customize(ConfigurableEmbeddedServletContainer container) {
				container.setSessionTimeout(5, TimeUnit.MINUTES);
			}};
	}
}
