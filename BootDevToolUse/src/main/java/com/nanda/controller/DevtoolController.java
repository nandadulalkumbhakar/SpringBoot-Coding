package com.nanda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevtoolController {
	
	@RequestMapping("/test")
	//@ResponseBody
	public String demo()
	{
		int a=30;
		int b=20;
		return "Sum of 2 number is "+(a+b);
	}

}
