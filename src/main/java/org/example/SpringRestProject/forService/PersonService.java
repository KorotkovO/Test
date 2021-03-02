package org.example.SpringRestProject.forService;


import org.example.SpringRestProject.forModel.Person;
import org.example.SpringRestProject.forRepository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService implements InPersonService {

    @Autowired
    PersonRepository personrep;


    @Override
    public List<Person> findAll() {
        return (List<Person>)personrep.findAll();
    }


    @Override
    public Person add(Person person) {
        personrep.save(person);
        return person;
    }


    @Override
    public Person findByName(String name) {

        var persons = personrep.findAll();
        for (Person person : persons) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return null;
    }


    @Override
    public Person findBbyID(Long id) {

        var persons = personrep.findAll();
        for (Person person : persons) {
            if (person.getId() == (id)) {
                return person;
            }
        }
        return null;

    }
}
