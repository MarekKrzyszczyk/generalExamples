package com.sda.general.ex03v2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        person.setName("Janusz");
        person.setSurname("Roman");
        person.setPhoneNumber("661786432");
        person.setEMail("janusz@wp.pl");

        Person person2 = new Person();
        person2.setName("Janina");
        person2.setSurname("Mędrzec");
        person2.setPhoneNumber("698965467");
        person2.setEMail("janina@wp.pl");

        List<Person> persons = new ArrayList<>();
        List<Person> personsFromJson;
        persons.add(person);
        persons.add(person2);

        JsonFilesService jsonFilesService = new JsonFilesService();
        jsonFilesService.insertToJsonFile(persons);
        personsFromJson = jsonFilesService.convertJSONToObject();
        


    }

}
