package org.person.controller;

import java.util.List;

import org.person.dao.PersonRepository;
import org.person.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

	@Autowired
	PersonRepository personRepository;

	public List<Person> savePerson(@RequestBody String personName) {
		Person p = new Person(personName);
		personRepository.save(p);
		List<Person> people = personRepository.findAll(new PageRequest(0, 10)).getContent();
		return people;
	}

}
