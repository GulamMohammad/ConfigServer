package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudEcsConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEcsConfigServerApplication.class, args);
	}

}
