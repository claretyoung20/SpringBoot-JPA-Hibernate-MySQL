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
        car.setCarmodel(new Carmodel(mid, ""));
        car.setPerson(new Person(id,"",""));

        carService.save(car);
    }

    @RequestMapping(value = "/car")
    public List<Car> findAll(){
        return carService.findAll();
    }

    @RequestMapping(value = "car/{id}", method = RequestMethod.GET)
    public Car getOne(@PathVariable int id){
        return carService.getOne(id);
    }
    @RequestMapping(value = "car/person/{id}", method = RequestMethod.GET)
    public List<Car> getByPersonId(@PathVariable int id){
        return carService.getByPersonId(id);
    }

    @RequestMapping(value = "car/{id}/model/{mid}/{cid}", method = RequestMethod.PUT)
    public void update(@RequestBody Car car, @PathVariable int id, @PathVariable int mid, @PathVariable int cid){
        car.setCarmodel(new Carmodel(mid, ""));
        car.setPerson(new Person(id,"",""));
        car.setId(cid);
         carService.update(car);
    }

}
