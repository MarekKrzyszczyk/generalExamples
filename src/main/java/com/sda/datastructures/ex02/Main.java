package com.sda.datastructures.ex02;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for(int i =0; i<10; i++){
            numbers.add(RandomNumber.getRandomint(99));
        }
        numbers.stream().forEach(integer -> System.out.print(integer+", "));
    }
}
