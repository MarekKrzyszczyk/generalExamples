package com.sda.conditions.ex07;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String imie = "Adamiks";
        char [] tabelka = imie.toCharArray();

        System.out.println(imie.endsWith("s"));

        if(imie.toCharArray()[0] == imie.toUpperCase().toCharArray()[0]){
            System.out.println("TAK");
        }
        else {
            System.out.println("NIE");
        }
    }
}