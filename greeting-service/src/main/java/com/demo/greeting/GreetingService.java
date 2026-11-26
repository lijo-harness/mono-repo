
package com.demo.greeting;

public class GreetingService {

    public String greet(String name) {
        if (name == null || name.isBlank()) {
            return "Hello, Guest!";
        }

        return "Hello, " + name.trim() + "!";
    }

    public String farewell(String name) {
        if (name == null || name.isBlank()) {
            return "Goodbye, Guest!";
        }

        return "Goodbye, " + name.trim() + "!";
    }
}
