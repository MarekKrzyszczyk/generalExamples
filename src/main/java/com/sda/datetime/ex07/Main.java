package com.sda.datetime.ex07;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM YYYY");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("HH:mm:ss");
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        String text = formatter.format(LocalDate.now()) + " roku, " + dayOfWeek.toString().toLowerCase() + " " + formatter2.format(LocalTime.now());
        System.out.println(text);
    }
}
