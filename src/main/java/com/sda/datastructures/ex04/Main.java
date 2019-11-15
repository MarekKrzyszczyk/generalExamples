package com.sda.datastructures.ex04;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Adam");
        names.add("Piotr");
        names.add("Arek");
        names.add("Maciej");
        names.add("Iga");
        names.add("Ola");
        names.add("Ania");
        names.add("Ania");
        names.add("Ola");

        System.out.println(names);
    }
}
