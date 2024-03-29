package com.hcty.springboot.learing;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

/**
* @Author: hechuan on 2019/8/20 11:19
*/
@SpringBootApplication public class SpringBootLearingApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootLearingApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return  args -> {
			System.out.println("Lit's inspect the beans provided by Spring Boot:");
			String [] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				System.out.println(beanName);
			}
		};
	}
}
