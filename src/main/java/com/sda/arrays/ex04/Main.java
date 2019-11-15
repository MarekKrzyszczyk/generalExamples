package com.sda.arrays.ex04;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 44, 78, 3};
        int[] array2 = {1, 6, 44, 78, 3};

        if (ComparingArrays.compareTwoArrays(array1, array2)) {
            System.out.println("Równe");
        } else {
            System.out.println("Różne");
        }
    }
}
