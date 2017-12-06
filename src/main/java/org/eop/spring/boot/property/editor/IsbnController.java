package org.eop.spring.boot.property.editor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

/**
 * @author lixinjie
 * @since 2017-09-20
 */
@Controller
public class IsbnController {

	//注册自定义属性编辑器
	//自定义属性编辑器非线程安全
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(IsbnBean.class, new IsbnEditor());
	}
}
