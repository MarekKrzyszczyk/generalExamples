package com.sda.general.ex01v2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TypeConverterTest {
    TypeConverter typeConverter = new TypeConverter();

    @Test
    void convertedCorrect() {
        assertEquals("trzydzieści osiem", typeConverter.converter("38"));
    }

    @Test
    void convertedIncorrect() {
        assertNotEquals("trzydzieści osiem", typeConverter.converter("37"));
    }
}