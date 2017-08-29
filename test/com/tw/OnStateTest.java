package com.tw;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class OnStateTest {

    @Test
    void displayFanOnMessage() {
        String deviceOn = "Device On";
        IO io = mock(IO.class);
        new OnState(io);

        verify(io).println(deviceOn);
    }

    @Test
    void shouldChangeStateOfFan() {
        IO io = mock(IO.class);
        ElectricalDevice device = mock(ElectricalDevice.class);
        OnState onState = new OnState(io);

        onState.changeState(device);

        verify(device).setState(Mockito.any(OffState.class));
    }

}