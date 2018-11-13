package xyz.oleryu.springcloud.erypeera;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class ErypeerAApplication {

	public static void main(String[] args) {
		SpringApplication.run(ErypeerAApplication.class, args);
	}
}
