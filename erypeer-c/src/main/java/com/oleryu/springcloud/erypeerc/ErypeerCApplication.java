package com.oleryu.springcloud.erypeerc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaClient
@SpringBootApplication
public class ErypeerCApplication {

	public static void main(String[] args) {
		SpringApplication.run(ErypeerCApplication.class, args);
	}
}
