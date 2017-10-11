package com.example.db.dbdemoproject.model;


import javax.persistence.*;

@Entity
@Table(name = "car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "carName")
    private String carName;

    @ManyToOne(optional = false)
    @JoinColumn(name = "personId")
    private Person person;

    @ManyToOne(optional = false)
    @JoinColumn(name = "carmodelId")
    private Carmodel carmodel;

    public Car() {
    }

    public Car(int id, String carName, Person person, Carmodel carmodel) {
        this.id = id;
        this.carName = carName;
        this.person = person;
        this.carmodel = carmodel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Carmodel getCarmodel() {
        return carmodel;
    }

    public void setCarmodel(Carmodel carmodel) {
        this.carmodel = carmodel;
    }
}
