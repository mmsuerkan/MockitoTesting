package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class GreetingServiceSpyTest {

    @Spy
    private GreetingService greetingService;

    @Test
    void greet() {
        when(greetingService.greet(anyString())).thenReturn("Hello, Mockito");
        assertEquals("Hello, Mockito", greetingService.greet("John Doe"));
        assertEquals("Hello, Jane Doe", greetingService.greet("Jane Doe"));
    }
}
