package org.eop.spring.boot.property.source;

import org.springframework.context.annotation.PropertySource;

/**
 * @author lixinjie
 * @since 2017-09-19
 */
@PropertySource(value = {"classpath:jdbc.properties", "classpath:base.properties"}, ignoreResourceNotFound = true)
public class PropertySourceBean {

}
