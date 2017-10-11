package com.example.db.dbdemoproject.repository;

import com.example.db.dbdemoproject.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonRepository extends JpaRepository<Person, String> {
}
