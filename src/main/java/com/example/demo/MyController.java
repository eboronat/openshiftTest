package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class MyController {

	@RequestMapping("/")
	public String sayHello() {
		return "Heeellooo!";
	}
}
