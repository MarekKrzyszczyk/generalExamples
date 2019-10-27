package com.sda.regularexpressions.ex03;

import lombok.extern.slf4j.Slf4j;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


@Slf4j
public class NameValidator {

    public boolean validate(String name){
        Pattern p = Pattern.compile("^[A-Z]{1}[a-z]*$");
        Matcher m = p.matcher(name);
        return m.matches();
    }

}
