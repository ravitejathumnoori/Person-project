package com.test.concurr.Test_Lock.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * A sample greetings controller to return greeting text
 */
@RestController
public class GreetingsController {
	
   	@Autowired
	PersonService personService;

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Optional<Person> greetingText(@PathVariable String name) {
    	
    	Optional<Person> listPers = personService.getName(name);
    	System.out.println(listPers);
        return listPers;
    }
    
    @RequestMapping(value = "/{name}", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public String AddNameDB(@PathVariable String name) {
    	
    	personService.addPerson(name);
        return "Hello " + name + "!";
    }
    
    
    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public String addUser(@RequestBody Person person) {
    	
    	personService.addPerson(person);
        return "Hello " + person.getName() + "!";
    }

    
}
