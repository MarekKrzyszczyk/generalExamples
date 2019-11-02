package com.sda.conditions.ex02;


import com.sda.conditions.ex01.ScannerInt;

public class Main {
    public static void main(String[] args) {

        System.out.println("Podaj pierwszą liczbę: ");
        int number = ScannerInt.getIntFromScanner();

        System.out.println("Podaj drugą liczbę: ");
        int number2 = ScannerInt.getIntFromScanner();

        if (number > number2) {
            System.out.println(true);
        }
        else{
            System.out.println(false);

        }


    }

}
