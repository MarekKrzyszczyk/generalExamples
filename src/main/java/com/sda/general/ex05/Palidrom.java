package com.sda.general.ex05;

public class Palidrom {
    public boolean ifPalidrom(String text){
        String reverseText = new StringBuilder(text).reverse().toString();
        return text.replaceAll("\\s","").toUpperCase().equals(reverseText.replaceAll("\\s","").toUpperCase());
    }
}
