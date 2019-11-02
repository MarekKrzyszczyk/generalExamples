package com.sda.threads.ex02;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeThread extends Thread{

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");


    public void run(){
        LocalDateTime localDateTime = LocalDateTime.now();
        String formatDateTime = localDateTime.format(formatter);
        System.out.printf(formatDateTime);
        System.out.println();
    }
}
