package com.csoptt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 启动类
 * 可被注册中心发现
 * 可调用FeignClient
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class CsopttSonarMainApplication {

	public static void main(String[] args) {
		SpringApplication.run(CsopttSonarMainApplication.class, args);
	}

}

