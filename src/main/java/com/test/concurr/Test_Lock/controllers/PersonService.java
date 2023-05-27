package com.test.concurr.Test_Lock.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.test.concurr.Test_Lock.exceptions.PersonNotFoundException;

@Service
public class PersonService {
	
	@Autowired
	private PersonRep personRepository;
	
	
	public Optional<Person> getName(String name) {
		Optional<Person> personList = personRepository.findByName(name);
		
		personList.orElseThrow(() -> new PersonNotFoundException("Could not find person with name:"+name));
		
		return personRepository.findByName(name);
	}

	
	
	public void addPerson(String name) {
		Person person = new Person(name);
		personRepository.save(person);
		
	}
	
	public void addPerson(Person person) {
		personRepository.save(person);
		
	}


}
