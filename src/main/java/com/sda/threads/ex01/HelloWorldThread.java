package com.sda.threads.ex01;

public class HelloWorldThread implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello world!");
    }
}
