package org.example.SpringRestProject.forService;

import org.example.SpringRestProject.forModel.Person;

import java.util.List;



public interface InPersonService {

    List<Person> findAll();
    Person add(Person person);

    Person findByName(String name);
    Person findBbyID(Long id);

}
