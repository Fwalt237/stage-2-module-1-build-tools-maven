package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (str == null || str.trim().isEmpty()) {
            return false;
        }

        try {
            double number = Double.parseDouble(str.trim());
            return number > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
