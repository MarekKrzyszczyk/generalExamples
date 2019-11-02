package com.sda.threads.ex03;

public class Main {
    public static void main(String[] args) {
        new Thread(new IntegerThread()).start();
        new Thread(new IntegerThread()).start();
    }
}
