package com.sda.arrays.ex08;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArhitmeticStringTest {

    int[] numbers = {1, 2, 3, 4, 5};
    int[] numbers2 = {1, 2, 3, 4, 8};

    @Test
    void checkArray() {
        assertTrue(ArhitmeticString.checkArray(numbers));
        assertFalse(ArhitmeticString.checkArray(numbers2));
    }
}