package com.example.db.dbdemoproject.controller;

import com.example.db.dbdemoproject.model.Car;
import com.example.db.dbdemoproject.model.Carmodel;
import com.example.db.dbdemoproject.model.Person;
import com.example.db.dbdemoproject.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {
    @Autowired
    CarService carService;

    @RequestMapping(value = "/car/{id}/model/{mid}", method = RequestMethod.POST)
    public void save(@RequestBody Car car, @PathVariable int id, @PathVariable int mid){
        car.setCarmodelId(new Carmodel(mid, ""));
        car.setPersonId(new Person(id,"",""));

        carService.save(car);
    }

    @RequestMapping(value = "/car")
    public List<Car> findAll(){
        return carService.findall();
    }


}
