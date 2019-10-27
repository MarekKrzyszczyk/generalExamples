package com.sda.regularexpressions.ex06v2;

import lombok.extern.slf4j.Slf4j;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Slf4j
public class Validator {

    public boolean validate(String text){
        Pattern pattern = Pattern.compile("^[A-Z]*|[a-z]*|[0-9]*$");
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }
}
