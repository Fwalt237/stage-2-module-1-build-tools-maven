package com.epam.demo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class UtilsTest {

    @ParameterizedTest
    @ValueSource(strings = {"1", "2", "3", "100"})
    void allPositiveNumbers_shouldReturnTrueForPositive(String input) {
        assertTrue(Utils.isAllPositiveNumbers(List.of(input)));
    }

    @ParameterizedTest
    @ValueSource(strings = {"-1", "0", "-5"})
    void allPositiveNumbers_shouldReturnFalseForNonPositive(String input) {
        assertFalse(Utils.isAllPositiveNumbers(List.of(input)));
    }

    // Add more test methods as needed
}