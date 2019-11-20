package com.sda.io.ex10;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File folder = new File("C:\\Users\\Marek Krzyszczyk\\Desktop\\javaudp");
        String[] files = folder.list();
        for(String s: files){
            System.out.println(s);
        }
    }
}
