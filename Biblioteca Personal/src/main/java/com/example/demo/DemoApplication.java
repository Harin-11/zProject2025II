package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.example")
@EnableJpaRepositories(basePackages = "com.example.repository")
@EntityScan(basePackages = "com.example.model")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		mostrarMensajeBienvenida();
	}
	
	private static void mostrarMensajeBienvenida() {
		System.out.println("\n" + "=".repeat(60));
		System.out.println("        BIBLIOTECA PERSONAL - SISTEMA DE GESTIÓN");
		System.out.println("=".repeat(60));
		System.out.println("Servidor: http://localhost:8071");
		System.out.println("=".repeat(60) + "\n");
	}

}
