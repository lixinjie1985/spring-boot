package org.eop.spring.boot.error.handling;

import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.boot.web.servlet.ErrorPageRegistrar;
import org.springframework.boot.web.servlet.ErrorPageRegistry;
import org.springframework.http.HttpStatus;

public class MyErrorPageRegistrar implements ErrorPageRegistrar {
	//如果没有使用springmvc，可以使用这种方法注册错误页面
	@Override
	public void registerErrorPages(ErrorPageRegistry registry) {
		registry.addErrorPages(new ErrorPage(HttpStatus.BAD_REQUEST, "/400"));
	}

}
