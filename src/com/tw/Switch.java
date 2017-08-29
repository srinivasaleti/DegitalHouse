package com.tw;

//Represents an electrical device
class Switch {

    private final ElectricalDevice device;

    Switch(ElectricalDevice device) {
        this.device = device;
    }

    void press() {
        this.device.changeState();
    }

}
