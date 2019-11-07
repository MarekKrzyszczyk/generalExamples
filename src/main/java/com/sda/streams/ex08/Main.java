package com.sda.streams.ex08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(Arrays.asList("Marek", "Tomek", "Piotrek", "Adam", "Kamil",
                "Klaudia", "Jan", "Ola", "Ala", "Kinga"));

        strings.stream().sorted((o1, o2) -> o1.compareTo(o2)).forEach(s -> System.out.println(s));
    }
}