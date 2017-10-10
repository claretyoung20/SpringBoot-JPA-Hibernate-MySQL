package com.example.db.dbdemoproject.services;

import com.example.db.dbdemoproject.model.Carmodel;
import com.example.db.dbdemoproject.repository.CarmodelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarmodelService {
    @Autowired
    private CarmodelRepository carmodelRepository;

    public List<Carmodel> getAll(){
        List<Carmodel> carmodels = new ArrayList<>();
        carmodelRepository.findAll().forEach(carmodels::add);
        return carmodels;
    }

    public void save(Carmodel carmodel){
        carmodelRepository.save(carmodel);
    }

    public void update(Carmodel carmodel){
        carmodelRepository.save(carmodel);
    }

    public Carmodel getOne(int id){
        return carmodelRepository.findOne(id);
    }

}
