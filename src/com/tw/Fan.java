package com.tw;

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

