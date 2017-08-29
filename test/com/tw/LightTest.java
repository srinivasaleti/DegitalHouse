package com.tw;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class LightTest {

    @Test
    void shouldChangeStateOfFan() {
        Light light = new Light(mock(IO.class));
        State state = mock(State.class);

        light.setState(state);
        light.changeState();

        verify(state).changeState(light);
    }

}