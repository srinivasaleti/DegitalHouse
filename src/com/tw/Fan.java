package com.tw;

class Fan {

    private State fanState;

    void changeState() {
        this.fanState.changeState(this);
    }

    void setState(State state) {
        this.fanState = state;
    }

}
