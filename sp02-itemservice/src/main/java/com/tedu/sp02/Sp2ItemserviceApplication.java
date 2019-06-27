package com.tedu.sp02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient 
public class Sp2ItemserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sp2ItemserviceApplication.class, args);
	}

}
