package com.sda.streams.ex03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(Arrays.asList("Marek", "Tomek", "Piotrek", "Adam", "Kamil"));

        strings = strings.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        strings.stream().forEach(System.out::println);
    }
}
