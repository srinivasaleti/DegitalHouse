package com.tw;

//Represents an apparatus with rotating blades
class Fan implements ElectricalDevice {

    private State fanState;

    Fan(IO consoleIO) {
        this.fanState = new OffState(consoleIO);
    }

    @Override
    public void changeState() {
        this.fanState.changeState(this);
    }

    @Override
    public void setState(State state) {
        this.fanState = state;
    }

}

