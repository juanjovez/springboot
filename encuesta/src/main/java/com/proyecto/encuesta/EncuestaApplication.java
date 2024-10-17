package com.proyecto.encuesta;

import com.proyecto.encuesta.models.*;
import com.proyecto.encuesta.repositories.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EncuestaApplication {

	private static final Logger log = LoggerFactory.getLogger(EncuestaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(EncuestaApplication.class);
	}

	@Bean
	public CommandLineRunner demo(RepositorioUsuario repository) {
		return (args) -> {
			// save a few customers
			repository.save(new Usuario("Jack", "Bauer"));
			repository.save(new Usuario("Chloe", "O'Brian"));
			repository.save(new Usuario("Kim", "Bauer"));
			repository.save(new Usuario("David", "Palmer"));
			repository.save(new Usuario("Michelle", "Dessler"));
			// fetch all customers
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			repository.findAll().forEach(persona -> {
				log.info(persona.toString());
			});
			log.info("");

			// fetch an individual customer by ID
			Usuario persona = repository.findById(1L);
			log.info("Customer found with findById(1L):");
			log.info("--------------------------------");
			log.info(persona.toString());
			log.info("");

			// fetch customers by last name
			log.info("Customer found with findByLastName('Bauer'):");
			log.info("--------------------------------------------");
			repository.findByNombre("David").forEach(David -> {
				log.info(David.toString());
			});
			log.info("");
		};
	}

}
