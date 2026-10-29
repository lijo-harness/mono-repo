
package com.demo.strings;

public class StringUtils {

    public String reverse(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        return new StringBuilder(input).reverse().toString();
    }

    public boolean isPalindrome(String input) {
        if (input == null) {
            return false;
        }
        String normalized = input.replaceAll("\\s+", "")
                                 .toLowerCase();
        return normalized.equals(
            new StringBuilder(normalized).reverse().toString()
        );
    }

    public int countWords(String input) {
        if (input == null || input.trim().isEmpty()) {
            return 0;
        }
        return input.trim().split("\\s+").length;
    }

    public String capitalize(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        return input.substring(0, 1).toUpperCase()
            + input.substring(1);
    }
}
