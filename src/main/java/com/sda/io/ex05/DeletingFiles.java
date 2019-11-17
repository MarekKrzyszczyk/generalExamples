package com.sda.io.ex05;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeletingFiles {
    public void delete(String path) {
        Path p = Paths.get("C:\\Users\\Marek Krzyszczyk\\Desktop\\" + path);
        if (Files.exists(p)) {
            try {
                Files.delete(p);
                System.out.println("usunales plik: " + path);
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Nie udalo sie usunac pliku");
            }
        }
    }
}
