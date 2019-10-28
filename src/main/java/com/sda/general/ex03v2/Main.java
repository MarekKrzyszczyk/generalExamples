package com.sda.general.ex03v2;

import com.sda.regularexpressions.ex03.TextInput;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        TextInput textInput = new TextInput();
        Person person = new Person();

        List<Person> persons = new ArrayList<>();
        person.setName("Andrzej");
        person.setSurname("Wloks");
        person.setPhoneNumber("777555333");
        person.setEMail("andrzej@wp.pl");
        persons.add(person);

        List<Person> personsFromJson;
        List<Person> filtredPersons;

        System.out.println("Podaj imie");
        String name = textInput.getText();
        System.out.println("Podaj nazwisko");
        String surname = textInput.getText();
        System.out.println("Podaj numer telefonu");
        String phoneNumber = textInput.getText();
        System.out.println("Podaj email");
        String email = textInput.getText();

        PersonService personService = new PersonService();
        Person newPerson = personService.add(name, surname, phoneNumber, email);

        if (newPerson != null) {
            persons.add(newPerson);
        }

        JsonFilesService jsonFilesService = new JsonFilesService();
        SaveToJsonFile saveToJsonFile = new SaveToJsonFile();
        saveToJsonFile.insertToJsonFile(persons);
        personsFromJson = jsonFilesService.convertJSONToObject();
        System.out.println(personsFromJson);
        System.out.println("Podaj szukaną frazę: ");
        String text = textInput.getText();
        filtredPersons = personsFromJson.stream().filter(p -> p.getName().equals(text) || p.getSurname().equals(text)
                || p.getPhoneNumber().equals(text) || p.getEMail().equals(text)).collect(Collectors.toList());
        System.out.println(filtredPersons);
    }


}
