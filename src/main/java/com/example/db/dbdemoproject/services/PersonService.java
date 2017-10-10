package com.example.db.dbdemoproject.services;


import com.example.db.dbdemoproject.repository.PersonRepository;
import com.example.db.dbdemoproject.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;


    public List<Person> getAll(){
        List<Person> person = new ArrayList<>();
        personRepository.findAll().forEach(person::add);
        return person;
    }


    public Person getOne(String id) {
        return personRepository.findOne(id);
    }

    public void save(Person person) {
        personRepository.save(person);
    }

    public void update(Person person) {
        personRepository.save(person);
    }
}
