package com.hcty.springboot.learing.controller;

import com.hcty.springboot.learing.dto.ConfigBean;
import com.hcty.springboot.learing.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hechuan on 2019/8/20;
 */
@RestController
@EnableConfigurationProperties({ ConfigBean.class, User.class })
public class LucyController {
	@Autowired
	ConfigBean configBean;
	@RequestMapping(value="/lucy")
	public String miya(){
		return configBean.getGreeting()+" >>>"+configBean.getName()+" >>>"+configBean.getUuid()+" >>>"+configBean.getMax();
	}

	@Autowired
	User user;
	@RequestMapping(value="/user")
	public String user(){
		return user.getName()+" >>>"+user.getAge();
	}
}
