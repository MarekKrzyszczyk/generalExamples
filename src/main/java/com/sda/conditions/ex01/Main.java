package com.sda.conditions.ex01;


public class Main {

    public static void main(String[] args) {
        System.out.println("Podaj liczbę");

        int inputInt = ScannerInt.getIntFromScanner();

        if(inputInt>0){
            System.out.println("Podana liczba jest dodatnia");
        }
        else {
            System.out.println();
        }

    }
}
