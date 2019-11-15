package com.sda.generics.ex01;

public class Main {
    public static void main(String[] args) {
        Character[] numbers = {'1','2','4','9'};
        GenericTables genericTables = new GenericTables();
        genericTables.showArray(numbers);
    }
}
