package com.sda.regularexpressions.ex06v2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {
    Validator validator = new Validator();

    @ParameterizedTest
    @ValueSource(strings={"JAN", "auto", "1234"})
    void isValid(String text){
        assertTrue(validator.validate(text));
    }

    @ParameterizedTest
    @ValueSource(strings={"JAn", "auTo", "1A34"})
    void isNotValid(String text){
        assertFalse(validator.validate(text));
    }

}