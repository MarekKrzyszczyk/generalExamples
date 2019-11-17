package com.sda.io.ex02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyFile {

    public void copy(String oldFile, String newFile){
        Path source = Paths.get("C:\\Users\\Marek Krzyszczyk\\Desktop\\" + oldFile);
        Path destination = Paths.get("C:\\Users\\Marek Krzyszczyk\\Desktop\\" + newFile);
        try{
            Files.copy(source, destination, StandardCopyOption.COPY_ATTRIBUTES);
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
}
