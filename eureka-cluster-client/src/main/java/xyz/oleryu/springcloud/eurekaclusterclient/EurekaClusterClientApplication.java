package xyz.oleryu.springcloud.eurekaclusterclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class EurekaClusterClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClusterClientApplication.class, args);
	}
}
