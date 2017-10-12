package com.example.db.dbdemoproject.services.mapper;

import com.example.db.dbdemoproject.model.Person;
import com.example.db.dbdemoproject.services.dto.PersonDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface PersonMapper{

    @Mapping(source = "id", target = "personId")
    @Mapping(source = "name", target = "personName")
    @Mapping(source = "phoneNumber", target = "personPhoneNumber")
    PersonDTO toPersonDTO (Person person);


    @Mapping(target = "id", source = "personId")
    @Mapping(target = "name", source = "personName")
    @Mapping(target = "phoneNumber", source = "personPhoneNumber")
    Person toPerson(PersonDTO person);

    default Person fromId(int id) {
        if (id <= 0) {
            return null;
        }
        Person person = new Person();
        person.setId(id);
        return person;
    }
}
