package com.xr.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ScEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScEurekaServerApplication.class, args);

		System.out.println("************************************************************************");
		System.out.println("******                                                            ******");
		System.out.println("******         ψ(♥◠‿◠) Eureka Server 启动成功  (◠‿◠♥)ψ       ******");
		System.out.println("******                                                            ******");
		System.out.println("************************************************************************");
	}
}
