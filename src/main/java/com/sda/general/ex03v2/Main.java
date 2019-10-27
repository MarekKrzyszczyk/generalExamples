package com.sda.general.ex03v2;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Janusz", "Roman", "661786432", "janusz@wp.pl");
        Person person2 = new Person("Janina", "Mędrzec", "698965467", "janina@wp.pl");
        Person person3 = new Person("Klaudia", "Anakonda", "111222333", "klaudia@gmail.com");

        List<Person> persons = new ArrayList<>();
        persons.add(person);
        persons.add(person2);
        persons.add(person3);

        JsonFilesService jsonFilesService = new JsonFilesService();
        jsonFilesService.insertToJsonFile(persons);
    }

}
