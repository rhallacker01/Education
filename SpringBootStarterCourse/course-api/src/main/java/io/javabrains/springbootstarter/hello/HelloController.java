package io.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello") //maps only to the HTTP GET method by default.
	public String sayHi() {
		return "Hi";
	}
}
