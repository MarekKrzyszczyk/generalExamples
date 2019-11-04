package com.sda.streams.ex04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(Arrays.asList("Marek", "Tomek", "Piotrek", "Adam", "Kamil"));
        List<Integer> sizes = strings.stream().map(s -> s.length()).collect(Collectors.toList());
        sizes.stream().forEach(System.out::println);
    }
}
