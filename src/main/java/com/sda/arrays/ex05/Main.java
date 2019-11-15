package com.sda.arrays.ex05;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 8, 18, 23};
        int[] copiedNumbers = CopiedArray.copyArray(numbers);
        System.out.println(Arrays.toString(CopiedArray.copyArray(numbers)));
    }
}
