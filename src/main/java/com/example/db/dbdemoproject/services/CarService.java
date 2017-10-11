package com.example.db.dbdemoproject.services;


import com.example.db.dbdemoproject.model.Car;
import com.example.db.dbdemoproject.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public List<Car> findAll(){
        List<Car> cars = new ArrayList<>();
        carRepository.findAll().forEach(cars::add);
        return cars;
    }
    public void save(Car car){
        carRepository.save(car);
    }

    public Car getOne(int id){
        return carRepository.findOne(id);
    }

    public void update(Car car){
        carRepository.save(car);
    }

    public  List<Car> getByPersonId( int id){
        List<Car> cars = new ArrayList<>();
        carRepository.findByPersonId(id).forEach(cars::add);
        return cars;
    }

}
