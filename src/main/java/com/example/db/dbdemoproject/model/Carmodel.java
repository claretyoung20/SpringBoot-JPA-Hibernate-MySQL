package com.example.db.dbdemoproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Carmodel {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "modelName")
    private String modelName;

    public Carmodel(){}

    public Carmodel(int id, String modelName) {
        this.id = id;
        this.modelName = modelName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
}
