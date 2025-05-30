package com.aluracursos.desafioAldo;

import com.aluracursos.desafioAldo.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioAldoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DesafioAldoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.muestraElMenu();
	}
}
