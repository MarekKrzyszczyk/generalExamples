package com.sda.threads.ex03;

public class IntegerThread implements Runnable {


    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName()+" " +i);
        }
    }
}
