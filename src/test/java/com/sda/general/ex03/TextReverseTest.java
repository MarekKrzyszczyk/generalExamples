package com.sda.general.ex03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextReverseTest {

    @Test
    public void isReversed(){
        assertEquals(new TextReverse().reverseText("Marek"), "keraM");
    }

    @Test
    public void isNotReversed(){
        assertNotEquals(new TextReverse().reverseText("Adam"), "keraM");
    }
}