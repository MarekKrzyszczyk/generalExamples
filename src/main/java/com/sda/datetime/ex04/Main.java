package com.sda.datetime.ex04;

import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2017,01,01);
        LocalDate localDate2 = LocalDate.of(2017,05,05);
        Period period = Period.between(localDate, localDate2);
        Period period2 = Period.ofWeeks(7);

        System.out.println(period);
    }
}
