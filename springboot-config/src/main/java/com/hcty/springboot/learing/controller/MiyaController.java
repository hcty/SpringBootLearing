package com.hcty.springboot.learing.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hechuan on 2019/8/20;
 */
@RestController
public class MiyaController {
	@Value("${my.name}")
	private String name;
	@Value("${my.age}")
	private int age;
	@RequestMapping(value="/miya")
	public String miya(){
		return name+":"+age;
	}
}
