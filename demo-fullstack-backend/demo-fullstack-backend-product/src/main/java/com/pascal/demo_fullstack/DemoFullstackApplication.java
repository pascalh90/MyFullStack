package com.pascal.demo_fullstack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DemoFullstackApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoFullstackApplication.class, args);
	}
}
