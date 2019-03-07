package com.zz.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class ConsumerController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping(value = "/consumer", method = RequestMethod.GET)
	public String helloConsumer(){
		log.info("consumer");
		return restTemplate.getForEntity("http://CLIENT/hello", String.class).getBody();
	}
}
