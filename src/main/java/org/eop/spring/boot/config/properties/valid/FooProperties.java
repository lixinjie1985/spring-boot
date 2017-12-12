package org.eop.spring.boot.config.properties.valid;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
@ConfigurationProperties("foo")
@Validated
public class FooProperties {
	//使用@Validated注解来进行验证
    private boolean enabled;

    @NotNull
    private InetAddress remoteAddress;
    
    //使用@Valid注解来对嵌套属性进行验证
    @Valid
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

    	@NotEmpty
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