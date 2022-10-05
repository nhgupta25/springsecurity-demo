package com.seleniumexpress.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

	@GetMapping("/helloWorld")
	public String helloWorld(){
		return "hello-world";
	}
	
	@ResponseBody
	@GetMapping("/hello")
	public String hello(){
		return "hello guys!!";
	}
	
	@ResponseBody
	@GetMapping("/bye")
	public String bye(){
		return "bye bye guys!!!";
	}
}
