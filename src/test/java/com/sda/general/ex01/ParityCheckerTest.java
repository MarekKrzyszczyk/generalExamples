package com.sda.general.ex01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParityCheckerTest {

    ParityChecker parityChecker = new ParityChecker();

    @Test
    public void shouldReturnFalseOnIsOddWhenEvenNumberIsProvided() {
        assertFalse(parityChecker.isOdd(8));
    }

    @Test
    public void shouldReturnTrueOnIsOddWhenOddNumberIsProvided() {
        assertTrue(parityChecker.isOdd(7));
    }

    @Test
    public void shouldReturnFalseOnIsEvenWhenOddNumberIsProvided() {
        assertFalse(parityChecker.isEven(7));
    }

    @Test
    public void shouldReturnTrueOnIsEvenWhenEvenNumberIsProvided() {
        assertTrue(parityChecker.isEven(8));
    }

}