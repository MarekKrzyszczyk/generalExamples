package com.sda.arrays.ex09;

public class RemoveFromArrays {


    public static int[] removeValues(int[] array1, int[] array2) {
        int[] res = new int[array1.length];
        int len = array1.length;
        boolean flag = false;
        for (int i = 0; i < array1.length; i++) {
            flag = false;
            for (int j : array2) {
                if (array1[i] == j) {
                    flag = true;
                    len--;
                }
            }
            if (!flag) {
                res[i] = array1[i];
            }
        }
        int[] result = new int[len];
        int j = 0;
        for (int i = 0; i < res.length; i++) {
            if (res[i] != 0) {
                result[i - j] = res[i];
            } else {
                j++;
            }
        }
        return result;
    }
}
