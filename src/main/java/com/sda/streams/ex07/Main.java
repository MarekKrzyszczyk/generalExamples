package com.sda.streams.ex07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(Arrays.asList("Marek", "Tomek", "Piotrek", "Adam", "Kamil",
                "Klaudia", "Jan", "Ola", "Ala", "Kinga"));

        strings.stream().filter(s -> s.equals("Jan")).forEach(System.out::println);
    }
}
