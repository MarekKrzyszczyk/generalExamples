package com.sda.general.ex01v2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class NumberValidatorTest {
    NumberValidator numberValidator = new NumberValidator();

    @ParameterizedTest
    @ValueSource(strings = {"23", "7", "89"})
    void validate(String text) {
        assertTrue(numberValidator.validate(text));
    }
}