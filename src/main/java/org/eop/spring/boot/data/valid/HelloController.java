package org.eop.spring.boot.data.valid;

import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lixinjie
 * @since 2017-09-20
 */
@RequestMapping("/hello")
@RestController
public class HelloController {

	@GetMapping("/say")
	public String sayHello(@Valid HelloBean hello, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return bindingResult.getFieldErrors().get(0).getDefaultMessage();
		}
		return null;
	}
}
