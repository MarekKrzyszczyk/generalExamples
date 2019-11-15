package com.sda.arrays.ex06;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 99, 128};
        int [] reversNumbers = ReversedArray.reverse(numbers);
        System.out.println(Arrays.toString(reversNumbers));
    }
}
