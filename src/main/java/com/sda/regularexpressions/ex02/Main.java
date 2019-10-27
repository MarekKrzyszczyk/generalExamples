package com.sda.regularexpressions.ex02;

import com.sda.regularexpressions.ex01.TelephoneValidator;

public class Main {
        public static void main(String[] args) {
            TelephoneValidatorWithCode telephoneValidatorWithCode = new TelephoneValidatorWithCode();
            System.out.println(telephoneValidatorWithCode.validate("9444333222"));
        }
    }
