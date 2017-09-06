package io.javaproject.learningspring.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/hello")
	public String helloWord() {
		return "Hello, World";
	}
}
