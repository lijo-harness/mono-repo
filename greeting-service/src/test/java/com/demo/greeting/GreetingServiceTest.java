
package com.demo.greeting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingServiceTest {

    private GreetingService greetingService;

    @BeforeEach
    void setUp() {
        greetingService = new GreetingService();
    }

    @Test
    void shouldGenerateGreeting() {
        assertEquals("Hello, Lijo!", greetingService.greet("Lijo"));
    }

    @Test
    void shouldGenerateFarewell() {
        assertEquals("Goodbye, Lijo!", greetingService.farewell("Lijo"));
    }

    @Test
    void shouldHandleNullName() {
        assertEquals("Hello, Guest!", greetingService.greet(null));
    }

    @Test
    void shouldHandleBlankName() {
        assertEquals("Hello, Guest!", greetingService.greet("  "));
    }
}
