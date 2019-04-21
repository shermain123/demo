package com.cn.bo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BoEuerkaApplication {

	public static void main(String[] args) {
		//启动方法 
		SpringApplication.run(BoEuerkaApplication.class, args);
	}

}
