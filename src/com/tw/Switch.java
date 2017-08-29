package com.tw;

class Switch {

    private final Fan fan;

    Switch(Fan fan) {
        this.fan = fan;
    }

    void press() {
        fan.changeState();
    }

}
