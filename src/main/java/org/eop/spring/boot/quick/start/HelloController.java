package org.eop.spring.boot.quick.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lixinjie
 * @since 2017-09-19
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping("/{world:.+}")
	public String hello(@PathVariable("world") String world) {
		return "hello " + world;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(HelloController.class, args);
	}

}
