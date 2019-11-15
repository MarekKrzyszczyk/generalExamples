package com.sda.arrays.ex09;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 19, 100, 999};
        int[] numbers2 = {19, 100};

        System.out.println(Arrays.toString(RemoveFromArrays.removeValues(numbers, numbers2)));
    }
}
