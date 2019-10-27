package com.sda.regularexpressions.ex12;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class ValidateWWWTest {

    ValidateWWW validateWWW = new ValidateWWW();

    @ParameterizedTest
    @ValueSource(strings = {"www.wp.pl", "www.euro.com"})
    void validate(String www) {
        assertTrue(validateWWW.validate(www));
    }
}