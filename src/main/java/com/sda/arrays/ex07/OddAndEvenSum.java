package com.sda.arrays.ex07;

public class OddAndEvenSum {
    public static String calculateOddAndEvenSum(int[] numbers) {
        int oddSum = 0;
        int evenSum = 0;
       String result;
        for (int i = 0; i < numbers.length; i = i + 2) {
            oddSum += numbers[i];
        }
        for (int i = 1; i < numbers.length; i = i + 2) {
            evenSum += numbers[i];
        }

        if (oddSum > evenSum) {
            result = "wygraly nieparzyste: " + oddSum;
        } else {
            result = "wygraly parzyste: " + evenSum;
        }
        return result;
    }
}
