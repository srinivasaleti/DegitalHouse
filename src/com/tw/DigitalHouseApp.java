package com.tw;

class DigitalHouseApp {

    public static void main(String[] args) {
        IO consoleIO = new ConsoleIO(System.out);
        Fan fan = new Fan(consoleIO);
        Switch aSwitch = new Switch(fan);

        aSwitch.press();
        aSwitch.press();
        aSwitch.press();
        aSwitch.press();
    }

}
