package com.ouhamza.spring.data.mongodb.repository;

import java.util.List;

import com.ouhamza.spring.data.mongodb.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<Person, String> {
  List<Person> findByIsTennager(boolean isTennager);
  List<Person> findByNameContaining(String name);
}
