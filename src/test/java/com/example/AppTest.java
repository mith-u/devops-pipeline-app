package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    public void testGreet() {
        assertEquals("Hello, Jenkins!", App.greet("Jenkins"));
    }
}

