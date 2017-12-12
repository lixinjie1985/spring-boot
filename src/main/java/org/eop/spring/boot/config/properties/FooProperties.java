package org.eop.spring.boot.config.properties;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("foo")
public class FooProperties {
	//该类标注了@ConfigurationProperties，它的属性将从Environment中进行配置
	//又因该类标注了@Component，它将被注册为一个bean，可以想普通bean一样被使用
	//如果该类没有被注册为一个bean，那么必须使用@EnableConfigurationProperties进行注册
	//@EnableConfigurationProperties(FooProperties.class)
    private boolean enabled;

    private InetAddress remoteAddress;

    private final Security security = new Security();

    public boolean isEnabled() {
    	return enabled;
    }

    public void setEnabled(boolean enabled) {

    }

    public InetAddress getRemoteAddress() {
    	return remoteAddress;
    }

    public void setRemoteAddress(InetAddress remoteAddress) {

    }

    public Security getSecurity() {
    	return security;
    }

    public static class Security {

        private String username;

        private String password;

        private List<String> roles = new ArrayList<>(Collections.singleton("USER"));

        public String getUsername() {
        	return username;
        }

        public void setUsername(String username) {

        }

        public String getPassword() {
        	return password;
        }

        public void setPassword(String password) {

        }

        public List<String> getRoles() {
        	return roles;
        }

        public void setRoles(List<String> roles) {

        }

    }
}