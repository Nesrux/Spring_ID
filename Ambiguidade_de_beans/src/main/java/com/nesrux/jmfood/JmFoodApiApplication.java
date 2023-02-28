package com.nesrux.jmfood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JmFoodApiApplication {
	//Main do projeto, o @SpringBootApplication  é uma anotação que define o main do pojeto, dentro dessa
	// Anotação, ele configura que todas as sub classes e pacotes serao escaniados para encontrar os componentes
	// Spring

	public static void main(String[] args) {
		SpringApplication.run(JmFoodApiApplication.class, args);
	}

}
