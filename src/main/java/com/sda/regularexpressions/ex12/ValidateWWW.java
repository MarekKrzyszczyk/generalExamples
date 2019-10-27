package com.sda.regularexpressions.ex12;

import lombok.extern.slf4j.Slf4j;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Slf4j
public class ValidateWWW {

    public boolean validate(String www){
        Pattern pattern = Pattern.compile("^(www.)[a-z]+\\.[a-z]*$");
        Matcher matcher = pattern.matcher(www);
        return matcher.matches();
    }
}
