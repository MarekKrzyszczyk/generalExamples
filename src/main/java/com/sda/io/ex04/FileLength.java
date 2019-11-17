package com.sda.io.ex04;

import java.io.File;

public class FileLength {
    public String lengthOfFile(String fileName) {
        File file = new File("C:\\Users\\Marek Krzyszczyk\\Desktop\\" + fileName);
        if (file.length() > 1024 * 1024) {
            return file.length() / 1024 / 1024 + " mb";
        } else if (file.length() > 1024) {
            return file.length() / 1024 + " kb";
        } else {
            return file.length() + " bytes";
        }

    }
}
