package com.tw;

//Represents off state of fan
class OffState implements State {

    private static final String DEVICE_OFF = "Device off";

    private IO consoleIO;

    OffState(IO consoleIO) {
        this.consoleIO = consoleIO;
        this.consoleIO.println(DEVICE_OFF);
    }

    @Override
    public void changeState(ElectricalDevice electricalDevice) {
        electricalDevice.setState(new OnState(this.consoleIO));
    }

}
