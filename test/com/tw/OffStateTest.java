package com.tw;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class OffStateTest {

    @Test
    void displayDeviceOffMessage() {
        String deviceOff = "Device off";
        IO io = mock(IO.class);
        new OffState(io);

        verify(io).println(deviceOff);
    }

    @Test
    void shouldChangeStateOfDevice() {
        IO io = mock(IO.class);
        ElectricalDevice device = mock(ElectricalDevice.class);
        OffState offState = new OffState(io);

        offState.changeState(device);

        verify(device).setState(Mockito.any(OnState.class));
    }

}