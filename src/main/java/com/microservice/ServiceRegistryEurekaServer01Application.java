package com.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryEurekaServer01Application {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryEurekaServer01Application.class, args);
		System.out.println("ServiceRegistryEurekaServer01Application Has Started !!");
	}

}
