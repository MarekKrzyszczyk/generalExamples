package com.sda.arrays.ex07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddAndEvenSumTest {

    @Test
    void calculateOddAndEvenSum() {
        int[] numbers = {9, 2, 3, 4, 11};
        assertEquals("wygraly nieparzyste: 23", OddAndEvenSum.calculateOddAndEvenSum(numbers));
    }
}