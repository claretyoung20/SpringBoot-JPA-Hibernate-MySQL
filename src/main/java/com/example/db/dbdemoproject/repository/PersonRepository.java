package com.example.db.dbdemoproject.repository;

import com.example.db.dbdemoproject.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface PersonRepository extends JpaRepository<Person, Integer> {

    @Query(value = "SELECT * FROM person",nativeQuery = true)
    List<Person> findD();
}
