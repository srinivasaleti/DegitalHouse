package com.tw;

//Represents off state of fan
class OffState implements State {

    private static final String FAN_OFF = "Fan off";

    private IO consoleIO;

    OffState(IO consoleIO) {
        this.consoleIO = consoleIO;
        this.consoleIO.println(FAN_OFF);
    }

    @Override
    public void changeState(Fan fan) {
        fan.setState(new OnState(this.consoleIO));
    }

}
