package com.sda.regularexpressions.ex02;

import lombok.extern.slf4j.Slf4j;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Slf4j
public class TelephoneValidatorWithCode {

    public boolean validate(String telephone){

        Pattern p = Pattern.compile("[+]?[0-9]{0,2}[0-9]{3}[\\s-]?[0-9]{3}[\\s-]?[0-9]{3}");
        Matcher m = p.matcher(telephone);
        return m.matches();
    }
}
