package com.sda.threads.ex02;

public class Main {
    public static void main(String[] args) {



        for (int i =0; i < 3; i++){
            Thread thread = new TimeThread();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            thread.start();
        }

    }
}
