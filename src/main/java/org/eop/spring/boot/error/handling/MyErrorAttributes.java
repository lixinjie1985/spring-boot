package org.eop.spring.boot.error.handling;

import java.util.Map;

import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;

@Component
public class MyErrorAttributes implements ErrorAttributes {
	//该类是spring boot在统一处理异常时获取异常属性
	//该类可以替换掉默认的DefaultErrorAttributes类
	//来提供自己异常属性获取
	@Override
	public Map<String, Object> getErrorAttributes(RequestAttributes requestAttributes, boolean includeStackTrace) {
		return null;
	}

	@Override
	public Throwable getError(RequestAttributes requestAttributes) {
		return null;
	}

}
