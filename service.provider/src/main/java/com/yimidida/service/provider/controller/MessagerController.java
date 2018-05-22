package com.yimidida.service.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessagerController {

	@RequestMapping("/hi")
    public String home(@RequestParam String name) {
		System.out.println(name+" is coming !");
        return "hi ! nice to meet you " + name;
    }
}
