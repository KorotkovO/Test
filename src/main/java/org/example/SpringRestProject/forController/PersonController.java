package org.example.SpringRestProject.forController;

import org.example.SpringRestProject.forModel.Person;
import org.example.SpringRestProject.forService.InPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/person/")
@Controller
public class PersonController {

    @Autowired
    private InPersonService personservice;


    @GetMapping()
    public ResponseEntity<List<Person>> getAll() {
        var persons = (List<Person>) personservice.findAll();
        return new ResponseEntity(persons, HttpStatus.OK);
    }

//    @GetMapping()
//    public List<Person> getAll() {
 //       var persons = (List<Person>) personservice.findAll();
   //     return persons;
   // }

    @GetMapping("/find/{name}")
    public Person findByName(@PathVariable(value = "name")String name){
        var person = (Person)personservice.findByName(name);
        return person;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Person> findById(@PathVariable(value = "id")Long id){
        return new ResponseEntity<>(this.personservice.findBbyID(id), HttpStatus.OK);
    }

    @PostMapping()
    public Person addPerson(@RequestBody Person person){
        return this.personservice.add(person);
    }


}

