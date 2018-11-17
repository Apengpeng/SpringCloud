package org.person.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.person.domain.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
