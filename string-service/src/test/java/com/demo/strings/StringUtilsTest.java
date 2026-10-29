
package com.demo.strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    private StringUtils stringUtils;

    @BeforeEach
    void setUp() {
        stringUtils = new StringUtils();
    }

    @Test
    void shouldReverseString() {
        assertEquals("olleh", stringUtils.reverse("hello"));
    }

    @Test
    void shouldDetectPalindrome() {
        assertTrue(stringUtils.isPalindrome("level"));
        assertTrue(stringUtils.isPalindrome("Never odd or even"));
        assertFalse(stringUtils.isPalindrome("harness"));
    }

    @Test
    void shouldCountWords() {
        assertEquals(3, stringUtils.countWords("Harness CI testing"));
    }

    @Test
    void shouldReturnZeroForEmptyInput() {
        assertEquals(0, stringUtils.countWords("   "));
    }

    @Test
    void shouldCapitalizeFirstLetter() {
        assertEquals("Harness", stringUtils.capitalize("harness"));
    }

    @Test
    void shouldHandleEmptyString() {
        assertEquals("", stringUtils.reverse(""));
        assertEquals("", stringUtils.capitalize(""));
    }
}
