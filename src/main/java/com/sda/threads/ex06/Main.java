package com.sda.threads.ex06;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        PersonThread personThread = new PersonThread();
        for (int i = 0; i < 5; i++) {
            executorService.execute(personThread);
        }
        executorService.shutdown();
    }
}
