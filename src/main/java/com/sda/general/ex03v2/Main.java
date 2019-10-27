package com.sda.general.ex03v2;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        Person person = new Person("Janusz", "Roman", "661786432", "janusz@wp.pl");
        Person person2 = new Person("Janina", "Mędrzec", "698965467", "janina@wp.pl");

        List<Person> persons = new ArrayList<>();
                persons.add(person);
                persons.add(person2);

        try {
            //Convert object to JSON string and save into file directly
            mapper.writeValue(new File("C:\\Users\\Marek Krzyszczyk\\Desktop\\java\\src\\main\\java\\com\\sda\\general\\ex03v2\\person.json"),persons);

        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
