package com.sda.datetime.ex05;

import java.time.Duration;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.of(14,11);
        LocalTime localTime2 = LocalTime.of(18,41);
        Duration duration = Duration.between(localTime, localTime2);
        System.out.println(duration);
    }
}
