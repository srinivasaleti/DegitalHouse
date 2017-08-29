package com.tw;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class FanTest {

    @Test
    void shouldChangeStateOfFan() {
        Fan fan = new Fan(mock(IO.class));
        State state = mock(State.class);

        fan.setState(state);
        fan.changeState();

        verify(state).changeState(fan);
    }

}