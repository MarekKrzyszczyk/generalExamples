package com.sda.optional.ex04;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        if(Optional.of("Anasdsdsdaj1").filter(s -> s.length()>=6 && s.matches("([A-Z]+)([a-z]+|[0-9]+)(.*)")).isPresent()){
            System.out.println("Pasi");
        }
        else{
            System.out.println("Nie pasi");
        }
    }
}
