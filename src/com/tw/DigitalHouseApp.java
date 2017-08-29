package com.tw;

class DigitalHouseApp {

    public static void main(String[] args) {
        Fan fan = new Fan();
        Switch aSwitch = new Switch(fan);

        aSwitch.press();
    }

}
