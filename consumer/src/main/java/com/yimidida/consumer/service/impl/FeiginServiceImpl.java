package com.yimidida.consumer.service.impl;

import org.springframework.stereotype.Component;

import com.yimidida.consumer.service.FeiginService;

@Component
public class FeiginServiceImpl implements FeiginService{

	@Override
	public String getFeiginMessage(String name) {
		// TODO Auto-generated method stub
		return "Service is Unavailable - Feigin";
	}

}
