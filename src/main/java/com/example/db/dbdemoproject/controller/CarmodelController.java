package com.example.db.dbdemoproject.controller;

import com.example.db.dbdemoproject.model.Carmodel;
import com.example.db.dbdemoproject.services.CarmodelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarmodelController {
    @Autowired
    CarmodelService carmodelService;

    @RequestMapping(value = "/model", method = RequestMethod.GET)
    public List<Carmodel> getAll(){
        return carmodelService.getAll();
    }

    @RequestMapping(value = "/model/{id}", method = RequestMethod.GET)
    public Carmodel getOne(@PathVariable int id){
        return carmodelService.getOne(id);
    }

    @RequestMapping(value = "/model", method = RequestMethod.POST)
    public void save(@RequestBody Carmodel carmodel){
        carmodelService.save(carmodel);
    }

    @RequestMapping(value = "/model/{id}", method = RequestMethod.PUT)
    public void update(@RequestBody Carmodel carmodel){
        carmodelService.update(carmodel);
    }

}
