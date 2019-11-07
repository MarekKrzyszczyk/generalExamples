package com.sda.streams.ex10;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {
    private String name;
    private String lastName;
    private int salary;
}
