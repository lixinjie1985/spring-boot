package org.eop.spring.boot.transactional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author lixinjie
 * @since 2017-09-20
 */
@Service
@Transactional
public class HelloService {

	@Transactional
	public String sayHello() {
		return "hello";
	}
}
