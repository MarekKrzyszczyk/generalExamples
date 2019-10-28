package com.sda.general.ex03v2;

public class PersonService {

    private PersonValidator personValidator;

    public PersonService() {
        this.personValidator = new PersonValidator();
    }

    public Person add(String name, String surname, String phoneNumber, String email){
        if(personValidator.validate(name, surname, phoneNumber, email)){
            Person person = new Person();
            person.setName(name);
            person.setSurname(surname);
            person.setPhoneNumber(phoneNumber);
            person.setEMail(email);
            return person;
        }
        return null;
    }
}
