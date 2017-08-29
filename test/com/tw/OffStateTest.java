package com.tw;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class OffStateTest {

    @Test
    void displayFanOFFMessage() {
        IO io = mock(IO.class);
        new OffState(io);

        verify(io).println("Fan off");
    }

}