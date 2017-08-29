package com.tw;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class SwitchTest {

    @Test
    void switchShouldChangeStateOfFanAssociatedWithItWhenWePressIt() {
        Fan fan = mock(Fan.class);
        Switch aSwitch = new Switch(fan);

        aSwitch.press();

        verify(fan).changeState();
    }

}
