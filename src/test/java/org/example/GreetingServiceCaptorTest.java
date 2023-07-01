package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class GreetingServiceCaptorTest {

    @Mock
    private GreetingService greetingService;

    @Captor
    private ArgumentCaptor<String> nameCaptor;

    @Test
    public void testGreet(){
        greetingService.greet("Mockito");
        verify(greetingService).greet(nameCaptor.capture());

        String name = nameCaptor.getValue();
        assertEquals("Mockito", name);

    }



}
