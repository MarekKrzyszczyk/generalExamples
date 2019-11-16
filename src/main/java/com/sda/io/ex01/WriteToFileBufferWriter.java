package com.sda.io.ex01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFileBufferWriter {
    public void writeFile(String title, String text) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Marek Krzyszczyk\\Desktop\\" + title + ".txt"));
        bufferedWriter.write(text);
        bufferedWriter.close();
    }
}
