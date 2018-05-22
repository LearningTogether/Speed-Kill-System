package com.yimidida.consumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.yimidida.consumer.service.impl.FeiginServiceImpl;

@FeignClient(value = "message-service",fallback=FeiginServiceImpl.class)
public interface FeiginService {
	
	 @RequestMapping(value = "/hi",method = RequestMethod.GET) 
	 String getFeiginMessage(@RequestParam(value = "name") String name);
}
