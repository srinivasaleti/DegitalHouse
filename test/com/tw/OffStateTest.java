package com.tw;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class OffStateTest {

    @Test
    void displayFanOFFMessage() {
        String fanOff = "Fan off";
        IO io = mock(IO.class);
        new OffState(io);

        verify(io).println(fanOff);
    }

}