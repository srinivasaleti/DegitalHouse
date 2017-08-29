package com.tw;

//Represents on state of fan
class OnState implements State {

    private static final String DEVICE_ON = "Device On";

    private IO consoleIO;

    OnState(IO consoleIO) {
        this.consoleIO = consoleIO;
        this.consoleIO.println(DEVICE_ON);
    }

    @Override
    public void changeState(ElectricalDevice electricalDevice) {
        electricalDevice.setState(new OffState(this.consoleIO));
    }

}
