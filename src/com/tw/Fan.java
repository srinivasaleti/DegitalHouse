package com.tw;

class Fan {

    private State fanState;

    Fan() {
        ConsoleIO consoleIO = new ConsoleIO(System.out);
        this.fanState = new OffState(consoleIO);
    }

    void changeState() {
        this.fanState.changeState(this);
    }

    void setState(State state) {
        this.fanState = state;
    }

}

