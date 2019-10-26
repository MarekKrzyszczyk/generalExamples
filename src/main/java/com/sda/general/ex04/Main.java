package com.sda.general.ex04;

public class Main {
    public static void main(String[] args) {
        RemovePolishSigns removePolishSigns = new RemovePolishSigns();
        System.out.println(removePolishSigns.reverseFromPolishToEnglish("żółć"));
        System.out.println(removePolishSigns.reverseFromPolishToEnglishbySwitch("żółć"));
    }
}
