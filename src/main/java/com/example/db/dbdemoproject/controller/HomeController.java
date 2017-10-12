package com.example.db.dbdemoproject.controller;
import com.example.db.dbdemoproject.model.Person;
import com.example.db.dbdemoproject.services.PersonService;
import com.example.db.dbdemoproject.services.dto.PersonDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class HomeController {

    @Autowired
    PersonService personService;

    @RequestMapping(value = "person", method = RequestMethod.GET)
    public List<Person> getAll(){
        return personService.getAll();
    }

    @RequestMapping(value = "persons", method = RequestMethod.GET)
    public List<Person> getAllD(){
        return personService.getF();
    }


    @RequestMapping(value = "person/{id}", method = RequestMethod.GET)
    public PersonDTO getOne(@PathVariable int id){
        return personService.getOne(id);
    }

    @RequestMapping(value = "person", method = RequestMethod.POST)
    public void addPerson(@RequestBody Person person){
         personService.save(person);
    }

    @RequestMapping(value = "/person/{id}", method = RequestMethod.PUT)
    public void update(@RequestBody Person person){
        personService.update(person);
    }
}
