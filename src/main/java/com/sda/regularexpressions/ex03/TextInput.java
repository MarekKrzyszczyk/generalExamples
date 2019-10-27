package com.sda.regularexpressions.ex03;

import java.util.Scanner;

public class TextInput {

    public String getText(){
        System.out.println("Podaj imie: ");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        return name;
    }

}
