package com.sda.regularexpressions.ex01;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class TelephoneValidatorTest {

    TelephoneValidator telephoneValidator = new TelephoneValidator();

    @ParameterizedTest
    @ValueSource(strings = {"505879357", "505 879 357", "505-879-357"})
    public void isValid(String number){
        assertTrue(telephoneValidator.validate(number));
    }

    @ParameterizedTest
    @ValueSource(strings = {"50 58 79 35 7", "5058794", "44505879357"})
    public void isNotValid(String number){
        assertFalse(telephoneValidator.validate(number));
    }
}