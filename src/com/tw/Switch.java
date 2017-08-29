package com.tw;

//Represents an electrical device
class Switch {

    private final Fan fan;

    Switch(Fan fan) {
        this.fan = fan;
    }

    void press() {
        fan.changeState();
    }

}
