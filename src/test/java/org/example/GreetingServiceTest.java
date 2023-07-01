package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class GreetingServiceTest {

    @Mock
    private GreetingService greetingService;

    @Test
    void greet() {
        when(greetingService.greet(anyString())).thenReturn("Hello, Mockito");
        assertEquals("Hello, Mockito", greetingService.greet("Mockito"));
    }
}