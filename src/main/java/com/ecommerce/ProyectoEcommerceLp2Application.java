package com.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude =  DataSourceAutoConfiguration.class)
public class ProyectoEcommerceLp2Application {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoEcommerceLp2Application.class, args);
	}

}
