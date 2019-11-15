package com.sda.arrays.ex05;

import java.util.Arrays;

public class CopiedArray {

    public static int[] copyArray(int[] array){
        return Arrays.copyOf(array,array.length);
    }
}
