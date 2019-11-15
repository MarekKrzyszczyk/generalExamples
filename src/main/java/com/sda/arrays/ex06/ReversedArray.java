package com.sda.arrays.ex06;

public class ReversedArray {
    public static int[] reverse(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            reversedArray[array.length - 1 - i] = array[i];
        }
        return reversedArray;
    }
}
