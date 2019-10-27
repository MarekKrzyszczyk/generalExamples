package com.sda.regularexpressions.ex03;

import com.sda.general.ex03.TextReverse;

public class Main {
    public static void main(String[] args) {
        NameValidator nameValidator = new NameValidator();
        TextInput textInput = new TextInput();
        System.out.println(nameValidator.validate(textInput.getText()));
    }
}
