package com.example.db.dbdemoproject.services;


import com.example.db.dbdemoproject.model.Car;
import com.example.db.dbdemoproject.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public List<Car> findall(){
        List<Car> cars = new ArrayList<>();
        carRepository.findAll().forEach(cars::add);
        return cars;
    }
    public void save(Car car){
        carRepository.save(car);
    }

    public Car getOne(@PathVariable int id){
        return carRepository.findOne(id);
    }

    public void update(Car car){
        carRepository.save(car);
    }

}
