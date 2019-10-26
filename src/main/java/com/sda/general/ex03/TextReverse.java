package com.sda.general.ex03;

public class TextReverse {


    public String reverseText(String text){
    StringBuilder stringBuilder = new StringBuilder(text);
    stringBuilder.reverse();
    return stringBuilder.toString();
    }
}
