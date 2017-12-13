package org.eop.spring.boot.error.handling;

import org.springframework.boot.autoconfigure.web.BasicErrorController;
import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.boot.autoconfigure.web.ErrorProperties;
import org.springframework.stereotype.Controller;

@Controller
public class ErrorController extends BasicErrorController {
	//spring boot使用该类来统一处理所有异常
	//具体可参考官方文档和父类源码
	//和springmvc里的统一异常处理不一样
	public ErrorController(ErrorAttributes errorAttributes, ErrorProperties errorProperties) {
		super(errorAttributes, errorProperties);
	}

}
