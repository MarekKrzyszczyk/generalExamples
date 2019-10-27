package com.sda.general.ex03v2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {
    private String name;
    private String surname;
    private String phoneNumber;
    private String eMail;

}
