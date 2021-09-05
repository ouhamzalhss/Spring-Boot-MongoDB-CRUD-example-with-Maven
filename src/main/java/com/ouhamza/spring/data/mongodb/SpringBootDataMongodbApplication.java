package com.ouhamza.spring.data.mongodb;

import com.ouhamza.spring.data.mongodb.model.Person;
import com.ouhamza.spring.data.mongodb.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDataMongodbApplication implements CommandLineRunner {
	@Autowired
	private PersonRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataMongodbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// save a couple of persons
		repository.save(new Person("14DIH","Mouhamed", "Ali", false));
		repository.save(new Person("15DIH", "Aymen", "Isami", true));

	}
}
