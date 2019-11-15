package com.sda.generics.ex02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GenericArrayToListTest {
    GenericArrayToList genericArrayToList = new GenericArrayToList();

    @Test
    void arrayToList() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,77));
        List<Double> listDouble = new ArrayList<>(Arrays.asList(1.0,2.0,3.0,77.0));
        Integer[] array = {1,2,3,77};

        assertEquals(list,genericArrayToList.arrayToList(array));
        assertNotEquals(listDouble, genericArrayToList.arrayToList(array));
    }
}