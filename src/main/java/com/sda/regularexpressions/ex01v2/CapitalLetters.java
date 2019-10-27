package com.sda.regularexpressions.ex01v2;

import lombok.extern.slf4j.Slf4j;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Slf4j
public class CapitalLetters {

    public boolean isUpperCase(String text){
        Pattern pattern = Pattern.compile("[A-Z]*");
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }

}
