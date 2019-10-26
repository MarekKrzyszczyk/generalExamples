package com.sda.general.ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Insert number: ");
        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();
        ParityChecker parityChecker = new ParityChecker();
        System.out.println("Even number: "+parityChecker.isEven(number));
        System.out.println("Odd number: "+parityChecker.isOdd(number));
    }
}
