package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
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
		System.out.println("\nNuestros Endpoints:");
		System.out.println("--> Libros:       http://localhost:8071/libros");
		System.out.println("--> Autores:      http://localhost:8071/api/autores");
		System.out.println("--> Categorías:   http://localhost:8071/api/categorias");
		System.out.println("\nInterfaz Web:");
		System.out.println("--> Página Principal: http://localhost:8071/");
		System.out.println("=".repeat(60) + "\n");
	}

}
