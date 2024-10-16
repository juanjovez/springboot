package Datos.Jpa;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {

	private static final Logger log = LoggerFactory.getLogger(JpaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class);
	}

	@Bean
	public CommandLineRunner demo(RepositorioPersona repository) {
		return (args) -> {
			// save a few customers
			repository.save(new Persona("Jack", "Bauer"));
			repository.save(new Persona("Chloe", "O'Brian"));
			repository.save(new Persona("Kim", "Bauer"));
			repository.save(new Persona("David", "Palmer"));
			repository.save(new Persona("Michelle", "Dessler"));

			// fetch all customers
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			repository.findAll().forEach(persona -> {
				log.info(persona.toString());
			});
			log.info("");

			// fetch an individual customer by ID
			Persona persona = repository.findById(1L);
			log.info("Customer found with findById(1L):");
			log.info("--------------------------------");
			log.info(persona.toString());
			log.info("");

			// fetch customers by last name
			log.info("Customer found with findByLastName('Bauer'):");
			log.info("--------------------------------------------");
			repository.findByApellido("Bauer").forEach(bauer -> {
				log.info(bauer.toString());
			});
			log.info("");
		};
	}

}