package com.tw;

//Represents on state of fan
class OnState implements State {

    private static final String FAN_ON = "Fan On";

    private IO consoleIO;

    OnState(IO consoleIO) {
        this.consoleIO = consoleIO;
        this.consoleIO.println(FAN_ON);
    }

    @Override
    public void changeState(Fan fan) {
        fan.setState(new OffState(this.consoleIO));
    }

}
