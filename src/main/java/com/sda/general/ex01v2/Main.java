package com.sda.general.ex01v2;

import com.sda.regularexpressions.ex03.TextInput;

public class Main {
    public static void main(String[] args) {


        TextInput textInput = new TextInput();
        NumberValidator numberValidator = new NumberValidator();
        TypeConverter typeConverter = new TypeConverter();
        System.out.println("Podaj liczbę od 1 do 99: ");


        String number = textInput.getText();

        if(!numberValidator.validate(number) || number.equals("0")){
            System.out.println("Podana liczba jest nieprawidłowa");
        } else{
            System.out.println(typeConverter.converter(number));
        }

    }
}
