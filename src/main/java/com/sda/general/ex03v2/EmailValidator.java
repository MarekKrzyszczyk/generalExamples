package com.sda.general.ex03v2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {

    public boolean validate(String email){
        Pattern pattern = Pattern.compile("^[a-z0-9]+[@]{1}[a-z]+\\.[a-z]{2}$");
        Matcher matcher = pattern.matcher(email);
        return  matcher.matches();
    }
}
