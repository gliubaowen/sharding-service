package com.lbw.data.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.lbw" })
public class ShardingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShardingServiceApplication.class, args);
	}

}
