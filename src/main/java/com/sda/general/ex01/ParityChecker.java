package com.sda.general.ex01;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ParityChecker {

    /**
     * asaS.
     * @param number dfggd
     * @return ASAASs
     */
    public boolean isOdd(final Integer number) {
        log.info("Checking isOdd()");
        log.debug("Checking number " + number + " if is odd. Result: " + (number % 2 != 0));
        return number % 2 != 0;
    }

    /**
     * asasaS.
     * @param number dfgdfd
     * @return asasa
     */

    public boolean isEven(final Integer number) {
        return number % 2 == 0;
    }
}
