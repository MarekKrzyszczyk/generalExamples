package com.sda.optional.ex02;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable(null);
        Integer result = optional.map(s -> s.length()).orElse(-1);
        System.out.println(result);
    }
}
