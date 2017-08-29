package com.tw;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class SwitchTest {

    @Test
    void switchShouldChangeStateOfDeviceAssociatedWithItWhenWePressIt() {
        ElectricalDevice device = mock(ElectricalDevice.class);
        Switch aSwitch = new Switch(device);

        aSwitch.press();

        verify(device).changeState();
    }

}
