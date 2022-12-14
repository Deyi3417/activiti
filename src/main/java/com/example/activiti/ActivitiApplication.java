package com.example.activiti;

import org.activiti.spring.boot.SecurityAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 刘德意
 * @date 2022/09/13
 */
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class ActivitiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActivitiApplication.class, args);
		System.out.println("======start success======");
	}

}
