package com.tw;

//Represents a bulb
class Light implements ElectricalDevice {

    private State lightState;

    Light(IO consoleIO) {
        this.lightState = new OffState(consoleIO);
    }

    @Override
    public void changeState() {
        this.lightState.changeState(this);
    }

    @Override
    public void setState(State state) {
        this.lightState = state;
    }

}
