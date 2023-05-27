package com.test.concurr.Test_Lock.controllers;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;



public interface PersonRep extends CrudRepository<Person, Integer> {
	
	Optional<Person> findByName(String name);
}
