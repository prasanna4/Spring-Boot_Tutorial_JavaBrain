package io.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	
	
	@RequestMapping("/hello")
	public String sayHi() {
		System.out.println("tut12 method called");
		return "Hi Prasanna,";
	}
}
