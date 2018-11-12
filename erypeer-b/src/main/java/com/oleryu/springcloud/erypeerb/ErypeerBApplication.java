package com.oleryu.springcloud.erypeerb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaClient
@SpringBootApplication
public class ErypeerBApplication {

	public static void main(String[] args) {
		SpringApplication.run(ErypeerBApplication.class, args);
	}
}
