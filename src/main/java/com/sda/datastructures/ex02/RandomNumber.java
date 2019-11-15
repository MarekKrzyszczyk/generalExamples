package com.sda.datastructures.ex02;

import java.util.Random;

public class RandomNumber {
    public static int getRandomint(int bound){
        Random random = new Random();
        return random.nextInt(bound);
    }
}
