package com.eumemu.labpadroesprojetospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 *Projeto Spring Boot Gerado via Spring Initializr
 *Módulos:
 *- Spring Data JPA
 *- Spring Web
 *- H2 Database
 *- OpenFeign
 * - Swagger
 * @author Vilson Souza
 * */
@EnableFeignClients
@SpringBootApplication
public class LabPadroesProjetoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabPadroesProjetoSpringApplication.class, args);
	}

}
