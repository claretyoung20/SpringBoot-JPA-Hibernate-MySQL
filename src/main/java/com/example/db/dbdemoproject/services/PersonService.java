package com.example.db.dbdemoproject.services;

import com.example.db.dbdemoproject.repository.PersonRepository;
import com.example.db.dbdemoproject.model.Person;
import com.example.db.dbdemoproject.services.dto.PersonDTO;
import com.example.db.dbdemoproject.services.mapper.PersonMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private PersonMapper personMapper;

    public List<Person> getAll(){
        List<Person> person = new ArrayList<>();
        personRepository.findAll().forEach(person::add);
        return person;
    }

    public List<Person> getF(){
        List<Person> person = new ArrayList<>();
        personRepository.findD().forEach(person::add);
        return person;
    }

    public void save(Person person) {
        personRepository.save(person);
    }

    public void update(Person person) {
        personRepository.save(person);
    }

    public PersonDTO getOne(int id) {
        Person person = personRepository.findOne(id);
        if(person == null){
            return null;
        }

        return personMapper.toPersonDTO(person);
    }
}
