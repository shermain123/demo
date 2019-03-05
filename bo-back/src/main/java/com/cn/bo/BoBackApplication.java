package com.cn.bo;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;


@SpringBootApplication
@ServletComponentScan
@EnableEurekaClient
@EnableFeignClients
@MapperScan("com.cn.bo.mapper")
public class BoBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoBackApplication.class, args);
	}

}
