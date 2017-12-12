package org.eop.spring.boot.config.yaml;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="my")
public class Config {
	//*.yml和*.properties文件的对应结构关系
	//yml文件可以转化为一个类的属性
	private List<String> servers = new ArrayList<String>();

    public List<String> getServers() {
        return this.servers;
    }
}
