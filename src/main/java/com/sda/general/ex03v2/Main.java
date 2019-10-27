package com.sda.general.ex03v2;

import com.sda.regularexpressions.ex03.TextInput;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        TextInput textInput = new TextInput();

        Person person = new Person();
        person.setName("Janusz");
        person.setSurname("Roman");
        person.setPhoneNumber("661786432");
        person.setEMail("janusz@wp.pl");

        Person person2 = new Person();
        person2.setName("Janina");
        person2.setSurname("Janusz");
        person2.setPhoneNumber("698965467");
        person2.setEMail("janina@wp.pl");

        List<Person> persons = new ArrayList<>();
        List<Person> personsFromJson;
        List<Person> filtredPersons;
        persons.add(person);
        persons.add(person2);

        JsonFilesService jsonFilesService = new JsonFilesService();
        // jsonFilesService.insertToJsonFile(persons);
        personsFromJson = jsonFilesService.convertJSONToObject();
        System.out.println("Podaj szukaną frazę: ");
        String text = textInput.getText();
        filtredPersons = personsFromJson.stream().filter(p -> p.getName().equals(text) || p.getSurname().equals(text)
                || p.getPhoneNumber().equals(text) || p.getEMail().equals(text)).collect(Collectors.toList());
        System.out.println(filtredPersons);
    }

}
