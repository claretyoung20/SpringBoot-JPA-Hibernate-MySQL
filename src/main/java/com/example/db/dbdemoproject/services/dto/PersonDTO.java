package com.example.db.dbdemoproject.services.dto;

public class PersonDTO {

    private int personId;
    private String personName;
    private String personPhoneNumber;

    public PersonDTO() {
    }

    public PersonDTO(PersonDTO dto) {
        this.personId = dto.getPersonId();
        this.personName = dto.getPersonName();
        this.personPhoneNumber = dto.getPersonPhoneNumber();
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonPhoneNumber() {
        return personPhoneNumber;
    }

    public void setPersonPhoneNumber(String personPhoneNumber) {
        this.personPhoneNumber = personPhoneNumber;
    }
}
