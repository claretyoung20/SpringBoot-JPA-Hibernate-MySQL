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
    private Person personId;

    @ManyToOne(optional = false)
    @JoinColumn(name = "carmodelId")
    private Carmodel carmodelId;

    public Car() {
    }

    public Car(int id, String carName, Person personId, Carmodel carmodelId) {
        this.id = id;
        this.carName = carName;
        this.personId = personId;
        this.carmodelId = carmodelId;
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

    public Person getPersonId() {
        return personId;
    }

    public void setPersonId(Person personId) {
        this.personId = personId;
    }

    public Carmodel getCarmodelId() {
        return carmodelId;
    }

    public void setCarmodelId(Carmodel carmodelId) {
        this.carmodelId = carmodelId;
    }
}
