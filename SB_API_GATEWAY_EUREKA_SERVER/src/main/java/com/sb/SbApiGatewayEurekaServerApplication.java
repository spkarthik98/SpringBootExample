package com.sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SbApiGatewayEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbApiGatewayEurekaServerApplication.class, args);
	}

}
