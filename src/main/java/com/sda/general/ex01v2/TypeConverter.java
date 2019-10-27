package com.sda.general.ex01v2;

import java.util.HashMap;
import java.util.Map;

public class TypeConverter {

    private Map<String, String> numbers = new HashMap<>();
    private Map<String, String> decimal = new HashMap<>();


    public TypeConverter() {
        this.numbers.put("1", "jeden");
        this.numbers.put("2", "dwa");
        this.numbers.put("3", "trzy");
        this.numbers.put("4", "cztery");
        this.numbers.put("5", "pięc");
        this.numbers.put("6", "sześć");
        this.numbers.put("7", "siedem");
        this.numbers.put("8", "osiem");
        this.numbers.put("9", "dziewięc");
        this.numbers.put("10", "dziesieć");
        this.numbers.put("11", "jedenaście");
        this.numbers.put("12", "dwanaście");
        this.numbers.put("13", "trzynaście");
        this.numbers.put("14", "czternaście");
        this.numbers.put("15", "pietnaście");
        this.numbers.put("16", "szesnaście");
        this.numbers.put("17", "siedemnaście");
        this.numbers.put("18", "osiemnascie");
        this.numbers.put("19", "dziewietnaście");
        this.decimal.put("2", "dwadzieścia");
        this.decimal.put("3", "trzydzieści");
        this.decimal.put("4", "czterdzieści");
        this.decimal.put("5", "pięcdziesiąt");
        this.decimal.put("6", "sześćdziesiąt");
        this.decimal.put("7", "siedemdziesiąt");
        this.decimal.put("8", "osiemdziesiąt");
        this.decimal.put("9", "dziewiećdziesiąt");

    }

    public String converter(String number) {
        String textNumber =  "";
        if (number.length() == 1 || number.charAt(0) == '1') {

            textNumber = numbers.get(number);
        } else if(number.charAt(01) == '0'){
            textNumber = decimal.get(String.valueOf(number.charAt(0)));
        }

        else {
            textNumber = decimal.get(String.valueOf(number.charAt(0))) + " " + (numbers.get(String.valueOf(number.charAt(1))));
        }
        return textNumber;
    }
}
