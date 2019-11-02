package com.sda.threads.ex04;

import com.sda.threads.ex03.IntegerThread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new IntegerThread());
        Thread thread2 = new Thread(new IntegerThread());

        thread2.start();
        thread2.join();
        thread1.start();
    }
}
