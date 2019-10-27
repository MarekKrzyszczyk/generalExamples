package com.sda.general.ex03v2;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonFilesService<T> {

    ObjectMapper mapper = new ObjectMapper();


    public void insertToJsonFile(List<T> listOfObjects) {
        try {
            //Convert object to JSON string and save into file directly
            mapper.writeValue(new File("C:\\Users\\Marek Krzyszczyk\\Desktop\\java\\src\\main\\java\\com\\sda\\general\\ex03v2\\person.json"), listOfObjects);
        } catch (
                JsonGenerationException e) {
            e.printStackTrace();
        } catch (
                JsonMappingException e) {
            e.printStackTrace();
        } catch (
                IOException e) {
            e.printStackTrace();
        }

    }
}
