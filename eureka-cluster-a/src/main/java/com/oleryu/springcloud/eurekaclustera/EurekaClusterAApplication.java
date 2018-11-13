package com.oleryu.springcloud.eurekaclustera;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaClusterAApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClusterAApplication.class, args);
	}
}
