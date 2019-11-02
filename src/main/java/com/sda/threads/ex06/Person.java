package com.sda.threads.ex06;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@Builder
@ToString
public class Person {
    private String name;
    private String lastName;
    private int age;
}
