package com.sda.io.ex06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WritingFile {
    public void writeFile(String file, int start, int end) {
        Charset charset = Charset.forName("UTF8");
        Path path = Paths.get("C:\\Users\\Marek Krzyszczyk\\Desktop\\" + file);
        try (BufferedReader bf = Files.newBufferedReader(path, charset)) {
            String line = null;
            int i = 0;
            while ((line = bf.readLine()) != null) {
                i++;
                if (i >= start && i < start + end) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
