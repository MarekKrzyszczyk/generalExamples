package com.sda.regularexpressions.ex03;

import java.util.Scanner;

public class TextInput {

    public String getText(){

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        return name;
    }

}
