package com.tw;

//Represents an apparatus with rotating blades
class Fan {

    private State fanState;

    Fan(IO consoleIO) {
        this.fanState = new OffState(consoleIO);
    }

    void changeState() {
        this.fanState.changeState(this);
    }

    void setState(State state) {
        this.fanState = state;
    }

}

