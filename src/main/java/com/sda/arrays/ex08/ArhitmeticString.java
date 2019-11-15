package com.sda.arrays.ex08;

public class ArhitmeticString {

    public static boolean checkArray(int[] array) {
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] != array[i - 1] + 1 || array[i] != array[i + 1] - 1) {
                return false;
            }
        }
        return true;
    }
}
