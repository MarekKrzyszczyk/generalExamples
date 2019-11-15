package com.sda.datastructures.ex06;

import com.sda.conditions.ex01.ScannerInt;
import com.sda.datastructures.ex02.RandomNumber;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> numbers = new PriorityQueue<>();
       int bound = ScannerInt.getIntFromScanner();
       for(int i =0; i<bound; i++){
           numbers.add(RandomNumber.getRandomint(100));
       }
        System.out.println(numbers);
    }
}
