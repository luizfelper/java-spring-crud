package com.felipe.crudspring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.felipe.crudspring.model.Curso;
import com.felipe.crudspring.repository.CourseRepository;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(CourseRepository courseRepository) {
		return args -> {
			courseRepository.deleteAll();

			Curso c = new Curso();
			c.setName("Angular com Spring");
			c.setCategory("front-End");

			courseRepository.save(c);

			Curso c1 = new Curso();
			c1.setName("React com Spring");
			c1.setCategory("front-End");

			courseRepository.save(c1);
		};
	}

}
