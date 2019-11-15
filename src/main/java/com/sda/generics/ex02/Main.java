package com.sda.generics.ex02;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Integer[] numbers = {1, 2, 7, 193};

        GenericArrayToList genericArrayToList = new GenericArrayToList();
        List list = genericArrayToList.arrayToList(numbers);
        System.out.println(list);

    }
}
