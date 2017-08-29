package com.tw;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

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

    @Test
    void shouldChangeStateOfFan() {
        IO io = mock(IO.class);
        Fan fan = mock(Fan.class);
        OffState offState = new OffState(io);

        offState.changeState(fan);

        verify(fan).setState(Mockito.any(OnState.class));
    }

}