package com.sda.threads.ex06;

import lombok.Getter;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Getter
public class PersonThread extends Thread {
    private List<String> names = new ArrayList<>(Arrays.asList("Adam", "Anna", "Tomek", "Marek", "Klaudia", "Piotrek", "Zocha",
            "Kubuś", "Filip", "Michal"));
    private List<String> lastNames = new ArrayList<>(Arrays.asList("Nowak", "Kowal", "Lis", "Ptak",
            "Onik", "Malek", "Kserda", "Kos", "Cis", "Lepik"));
    private List<String> pathNames = new ArrayList<>(Arrays.asList("person1", "person2", "person3", "person4",
            "person5", "person6", "person7", "person8", "person9", "person0"));

    ObjectMapper mapper = new ObjectMapper();
    private String path = "C:\\Users\\Marek Krzyszczyk\\Desktop\\java\\src\\main\\resources\\";

    @Override
    public void run() {

        Person person = Person.builder()
                .name(name())
                .lastName(lastName())
                .age(age())
                .build();

        try {
            //Convert object to JSON string and save into file directly
            mapper.writeValue(new File(path + path()), person);
        } catch (
                JsonGenerationException | JsonMappingException e) {
        } catch (IOException e) {
        }
    }

    public String name() {
        Random random = new Random();
        return names.get(random.nextInt(10));
    }

    public String lastName() {
        Random random = new Random();
        return lastNames.get(random.nextInt(10));
    }

    public int age() {
        Random random = new Random();
        return random.nextInt(99);
    }

    public String path() {
        Random random = new Random();
        return pathNames.get(random.nextInt(10));
    }

}
