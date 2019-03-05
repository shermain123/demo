package com.cn.bo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@ServletComponentScan
@EnableEurekaClient
@EnableFeignClients
@MapperScan("com.cn.bo.mapper")
@SpringBootApplication
public class BoMemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoMemberApplication.class, args);
	}

}
