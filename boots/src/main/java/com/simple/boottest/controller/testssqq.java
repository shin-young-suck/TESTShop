package com.simple.boottest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testssqq {
	
	@GetMapping("/main")
	public String main() {
		
		return "hello, world 테스트 입니다";
	}

}
