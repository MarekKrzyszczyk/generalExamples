package com.sda.threads.ex05;

public class IntegerThread implements Runnable {


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " rozpoczalem prace");
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        System.out.println(Thread.currentThread().getName() + " zakonczylem prace");
    }
}
