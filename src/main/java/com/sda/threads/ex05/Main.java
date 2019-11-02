package com.sda.threads.ex05;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Runnable runnable = new IntegerThread();

        for(int i =0; i<5;i++){
            executorService.execute(runnable);
        }
        executorService.shutdownNow();
    }
}
