package org.eop.spring.boot.spring.mybatis;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import com.alibaba.druid.pool.DruidDataSource;

/**
 * @author lixinjie
 * @since 2017-09-19
 */
@Configuration
public class MybatisBean {

	@Autowired
	private DruidDataSource druidDataSource;
	
	@Bean
	public SqlSessionFactoryBean sqlSessionFactoryBean() {
		SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(druidDataSource);
        sqlSessionFactory.setTypeAliasesPackage("org.eop.spring.boot.bean");
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource mybatisConfigXml = resolver.getResource("classpath:mybatis-config.xml");
        sqlSessionFactory.setConfigLocation(mybatisConfigXml);
        return sqlSessionFactory;
	}
}
