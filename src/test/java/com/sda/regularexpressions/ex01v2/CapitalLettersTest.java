package com.sda.regularexpressions.ex01v2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.input.CharAppender;

import static org.junit.jupiter.api.Assertions.*;

class CapitalLettersTest {

    CapitalLetters capitalLetters = new CapitalLetters();

    @ParameterizedTest
    @ValueSource(strings = {"JAN", "ANDRZEJ", "WIEWIORA"})
    void isUpperCase(String text) {
        assertTrue(capitalLetters.isUpperCase(text));
    }
}