package com.zz.eurekaclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello(){
		System.out.println("client2");
		return "this is client2";
	}
}
