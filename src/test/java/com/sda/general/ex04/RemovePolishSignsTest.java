package com.sda.general.ex04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemovePolishSignsTest {

    RemovePolishSigns removePolishSigns = new RemovePolishSigns();

    @Test
    public void RemovePolishSigns(){

        String correctResult = "zolc";
        assertEquals(correctResult, removePolishSigns.reverseFromPolishToEnglishbySwitch("żółć"));
        assertNotEquals("żolc",removePolishSigns.reverseFromPolishToEnglishbySwitch("żółć"));
        assertNotEquals("żolc",removePolishSigns.reverseFromPolishToEnglishbySwitch("żó"));

    }




}