package com.sda.general.ex03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj tekst do : ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        TextReverse textReverse = new TextReverse();
        System.out.println(textReverse.reverseText(text));
    }
}
