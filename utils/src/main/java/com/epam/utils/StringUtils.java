package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        return isNumeric(str) && Double.parseDouble(str) > 0;
    }
    private static boolean isNumeric(String str) {
        return str != null && str.matches("-?\\d+(\\.\\d+)?");
    }
}
