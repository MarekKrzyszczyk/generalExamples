package com.sda.optional.ex03;

import com.sda.optional.ex02.ScannerString;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> color = Optional.ofNullable("BLUE");

        System.out.println(color.map(s -> ColorEnum.valueOf(s)).orElse(ColorEnum.UNKNOWN));
    }
}
