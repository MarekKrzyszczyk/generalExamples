package com.sda.general.ex03v2;

import lombok.extern.slf4j.Slf4j;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class JsonFilesService<T> {

    ObjectMapper mapper = new ObjectMapper();
    private String path = "C:\\Users\\Marek Krzyszczyk\\Desktop\\java\\src\\main\\java\\com\\sda\\general\\ex03v2\\person.json";

    public void insertToJsonFile(List<T> listOfObjects) {

        try {
            //Convert object to JSON string and save into file directly
            mapper.writeValue(new File(path), listOfObjects);
        } catch (
                JsonGenerationException | JsonMappingException e) {
            log.error(e.getMessage());
        } catch (IOException e) {
            log.error(e.getMessage());
        }

    }

    public List<Person> convertJSONToObject() {
        List<Person> listOfObjects = new ArrayList<>();
        try {
            // Convert JSON string from file to Object
            listOfObjects = mapper.readValue(new File(path), new TypeReference<List<Person>>() {
            });
            // Convert JSON string to Object
        } catch (
                JsonGenerationException | JsonMappingException e) {
            log.error(e.getMessage());
        } catch (IOException e) {
            log.error(e.getMessage());
        }
        return listOfObjects;
    }
}
