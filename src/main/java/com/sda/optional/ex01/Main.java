package com.sda.optional.ex01;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> text = Optional.ofNullable(null);
        String string = "";
        if (text.isPresent()){
            string = text.get();
        }
        else{
            string = "not available";
        }

        System.out.println("Piotr");
    }
}
