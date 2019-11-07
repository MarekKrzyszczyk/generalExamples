package com.sda.streams.ex09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(new Integer[]{1, 4, 2, 33, 1254, 1});
        System.out.println(numbers.stream().min((o1, o2) -> o1.compareTo(o2)));
        System.out.println(numbers.stream().max((o1, o2) -> o1.compareTo(o2)));
        System.out.println(numbers.stream().mapToDouble(value -> value).average());

        double suma = 0;
        for(Integer i: numbers){
            suma+=i;
        }
        suma = suma/6;
        System.out.println(suma);

    }
}
