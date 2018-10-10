package com.xr.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class ScSystemManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScSystemManagerApplication.class, args);


		System.out.println("************************************************************************");
		System.out.println("******                                                            ******");
		System.out.println("******         ψ(♥◠‿◠) Sytem Manager 启动成功  (◠‿◠♥)ψ       ******");
		System.out.println("******                                                            ******");
		System.out.println("************************************************************************");
	}
}
