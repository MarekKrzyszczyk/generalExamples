package com.sda.general.ex05;

public class Main {
    public static void main(String[] args) {
        Palidrom palidrom = new Palidrom();
        if (palidrom.ifPalidrom("Kajak")) {
            System.out.println("jest palidromem");
        } else {
            System.out.println("nie jest palidromem");
        }
    }
}
