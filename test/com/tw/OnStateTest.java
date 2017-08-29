package com.tw;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class OnStateTest {

    @Test
    void displayFanOnMessage() {
        String fanOn = "Fan On";
        IO io = mock(IO.class);
        new OnState(io);

        verify(io).println(fanOn);
    }

}