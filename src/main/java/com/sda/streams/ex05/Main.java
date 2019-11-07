package com.sda.streams.ex05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(new Integer[]{1, 4, 2, 33, 1254, 1, 6, 55, 22, 121, 8});
        System.out.println(numbers.stream().anyMatch(integer -> integer.equals(6)));
    }
}
