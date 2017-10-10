package com.example.db.dbdemoproject.repository;

import com.example.db.dbdemoproject.model.Car;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CarRepository extends CrudRepository<Car, Integer> {
}
