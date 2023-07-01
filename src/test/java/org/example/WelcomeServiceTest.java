package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;


 class WelcomeService {
    private GreetingService greetingService;
    public WelcomeService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String welcome(String name) {
        return greetingService.greet(name) + ", welcome!";
    }
}
@ExtendWith(MockitoExtension.class)
public class WelcomeServiceTest {
    @Mock
    GreetingService greetingService;

    @InjectMocks
    WelcomeService welcomeService;
    @Test
    public void testWelcome() {
        when(greetingService.greet(anyString())).thenReturn("Hello, Mockito");
        assertEquals("Hello, Mockito, welcome!", welcomeService.welcome("John Doe"));
    }
}
