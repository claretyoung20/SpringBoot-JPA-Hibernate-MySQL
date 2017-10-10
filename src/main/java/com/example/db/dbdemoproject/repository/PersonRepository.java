package com.example.db.dbdemoproject.repository;

import com.example.db.dbdemoproject.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;




public interface PersonRepository extends JpaRepository<Person, String> {
}
