package com.sda.datastructures.ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> imiona = new ArrayList<>(Arrays.asList("Tomek", "Ania", "Beata", "Grazka", "Adik"));
        imiona.sort((o1, o2) -> o1.compareTo(o2));
        System.out.println(imiona);
    }
}
