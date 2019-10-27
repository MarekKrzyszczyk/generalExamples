package com.sda.general.ex01v2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TypeConverterTest {
    TypeConverter typeConverter = new TypeConverter();

    @Test
    void converter() {
        assertEquals("trzydzieści osiem", typeConverter.converter("38"));
    }
}