package com.epam.utils;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @ParameterizedTest
    @ValueSource(strings = {"1", "123", "1000", "99999"})
    void isPositiveNumber_shouldReturnTrueForPositiveIntegers(String number) {
        assertTrue(StringUtils.isPositiveNumber(number));
    }

    @ParameterizedTest
    @ValueSource(strings = {"1.0", "123.45", "1000.01", "99999.99"})
    void isPositiveNumber_shouldReturnTrueForPositiveDoubles(String number) {
        assertTrue(StringUtils.isPositiveNumber(number));
    }

    @ParameterizedTest
    @ValueSource(strings = {"0", "-1", "-123", "-1000"})
    void isPositiveNumber_shouldReturnFalseForZeroAndNegativeIntegers(String number) {
        assertFalse(StringUtils.isPositiveNumber(number));
    }

    @ParameterizedTest
    @ValueSource(strings = {"-1.0", "-123.45", "-1000.01"})
    void isPositiveNumber_shouldReturnFalseForNegativeDoubles(String number) {
        assertFalse(StringUtils.isPositiveNumber(number));
    }

    @ParameterizedTest
    @ValueSource(strings = {"abc", "12,3", "1.a", ""})
    void isPositiveNumber_shouldReturnFalseForInvalidInput(String number) {
        assertFalse(StringUtils.isPositiveNumber(number));
    }

    @ParameterizedTest
    @ValueSource(strings = { " "})
    void isPositiveNumber_shouldReturnFalseForWhiteSpace(String number) {
        assertFalse(StringUtils.isPositiveNumber(number));
    }

    @Test
    void isPositiveNumber_shouldReturnFalseForNullInput() {
        assertFalse(StringUtils.isPositiveNumber(null));
    }
}