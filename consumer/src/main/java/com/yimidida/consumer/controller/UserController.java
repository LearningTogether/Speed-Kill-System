package com.yimidida.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.yimidida.consumer.service.FeiginService;
import com.yimidida.consumer.service.RestTemplateService;

@RestController
public class UserController {

	@Autowired RestTemplateService restTemplateService;
	@Autowired FeiginService  seiginService;
	
	@RequestMapping("getmessage")
	public String getmessage(String name){
		return restTemplateService.getUserMessages(name);
	}
	
	@RequestMapping("getmessages/feign")
	public String getmessages(String name){
		return seiginService.getFeiginMessage(name);
	}
	
	 @Value("${foo}")
	 String foo;
	 @RequestMapping(value = "/hi")
     public String hi(){
        return foo;
     }
	

}
