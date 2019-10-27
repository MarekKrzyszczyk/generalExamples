package com.sda.regularexpressions.ex01;


public class Main {
    public static void main(String[] args) {
        TelephoneValidator telephoneValidator = new TelephoneValidator();
        System.out.println(telephoneValidator.validate("444333222"));
    }
}
