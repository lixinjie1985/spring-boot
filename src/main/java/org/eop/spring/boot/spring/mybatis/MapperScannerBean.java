package org.eop.spring.boot.spring.mybatis;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lixinjie
 * @since 2017-09-19
 */
@Configuration
@AutoConfigureAfter(MybatisBean.class)
public class MapperScannerBean {

	@Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("org.eop.spring.boot.mapper");
        return mapperScannerConfigurer;
    }

}
