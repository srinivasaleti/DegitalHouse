package com.tw;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

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

    @Test
    void shouldChangeStateOfFan() {
        IO io = mock(IO.class);
        Fan fan = mock(Fan.class);
        OnState onState = new OnState(io);

        onState.changeState(fan);

        verify(fan).setState(Mockito.any(OffState.class));
    }

}