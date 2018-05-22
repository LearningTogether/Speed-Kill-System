package com.yimidida.consumer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yimidida.consumer.service.RestTemplateService;

@Service
public class RestTemplateServiceImpl implements RestTemplateService {

	@Autowired
	private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod="rollback")
	@Override
	public String getUserMessages(String name) {
		return restTemplate.getForObject("http://message-service/hi?name="+name, String.class);
	}
	
	public String rollback(String name){
		return "Service is Unavailable - RestTemplate";
	}

}
