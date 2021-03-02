package org.example.SpringRestProject.forRepository;

import org.example.SpringRestProject.forModel.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonRepository  extends CrudRepository<Person, Long> {
}


