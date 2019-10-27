package com.sda.regularexpressions.ex02;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class TelephoneValidatorWithCodeTest {
TelephoneValidatorWithCode telephoneValidatorWithCode = new TelephoneValidatorWithCode();

    @ParameterizedTest
    @ValueSource(strings = {"+48505888159","505888159"})
    void validate(String number) {
        assertTrue(telephoneValidatorWithCode.validate(number));
    }
}