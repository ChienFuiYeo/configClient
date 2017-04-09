package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class TestController {
	
	@Value("${test.home:Default}")
	private String testHomeWelcome;
	
	@Value("${test.message:Default}")
	private String testHomeMessage;
	
	@Value("${global.message}")
	private String testGlobalMessage;
	
	@RequestMapping("/testHome")
	public String testHomeWelcome(){
		return testHomeWelcome;
	}
	
	@RequestMapping("/testHomeMessage")
	public String testHomeMessage(){
		return testHomeMessage;
	}
	
	@RequestMapping("/testGlobalMessage")
	public String testGlobalMessage(){
		return testGlobalMessage;
	}
}
