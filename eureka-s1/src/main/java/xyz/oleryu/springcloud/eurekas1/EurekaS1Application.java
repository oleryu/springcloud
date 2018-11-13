package xyz.oleryu.springcloud.eurekas1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaS1Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaS1Application.class, args);
	}
}
