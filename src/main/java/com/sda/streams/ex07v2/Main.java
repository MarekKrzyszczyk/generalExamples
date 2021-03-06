package com.sda.streams.ex07v2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{148, 105, 36, 37, 56, 132, 121, 36, 180, 8, 61, 171, 180, 6, 65, 0, 66, 58, 162, 25, 128, 35, 32, 4, 104, 6,
                75, 31, 66, 125, 188, 159, 121, 61, 173, 188, 34, 141, 182, 192, 18, 18, 165, 136, 76, 64, 41, 195, 147, 74};

        List<Double> sqrtNumbers = Arrays.stream(numbers).mapToDouble(value -> Math.floor(Math.sqrt(value) * 100) / 100).boxed().collect(Collectors.toList());
        System.out.println(sqrtNumbers);

        String imie;

    }
}
