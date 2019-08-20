package com.hcty.springboot.learing.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hechuan on 2019/8/20;
 */
@RestController
public class HelloController {
	/**
	 * @Author: hechuan on 2019/8/20 11:23
	 * @param: []
	 * @return: 返回结果
	 */
	@RequestMapping("/")
	public String hello(){
		return "Greetings from Spring Boot!";
	}
}
