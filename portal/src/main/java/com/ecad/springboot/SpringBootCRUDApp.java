package com.ecad.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.ecad.springboot.configuration.JpaConfiguration;


@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages={"com.ecad.springboot"})// same as @Configuration @EnableAutoConfiguration @ComponentScan
public class SpringBootCRUDApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCRUDApp.class, args);
	}
}
