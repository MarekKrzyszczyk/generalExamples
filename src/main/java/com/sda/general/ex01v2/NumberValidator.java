package com.sda.general.ex01v2;

import lombok.extern.slf4j.Slf4j;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Slf4j
public class NumberValidator {
    public boolean validate(String number){
        Pattern p = Pattern.compile("^[1-9]?[0-9]{1}$");
        Matcher m = p.matcher(number);
        return m.matches();
    }
}
