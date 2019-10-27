package com.sda.regularexpressions.ex03;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import javax.naming.Name;

import static org.junit.jupiter.api.Assertions.*;

class NameValidatorTest {

    NameValidator nameValidator = new NameValidator();

    @ParameterizedTest
    @ValueSource(strings = {"Jan", "Marek", "Joanna"})
    void isValid(String name) {
        assertTrue(nameValidator.validate(name));
    }

    @ParameterizedTest
    @ValueSource(strings = {"jan", "Mar8"})
    void isNotValid(String name) {
        assertFalse(nameValidator.validate(name));
    }

}