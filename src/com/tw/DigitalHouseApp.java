package com.tw;

//Represents entry point for app
class DigitalHouseApp {

    public static void main(String[] args) {
        IO consoleIO = new ConsoleIO(System.out);
        ElectricalDevice fan = new Fan(consoleIO);
        Switch aSwitch = new Switch(fan);

        aSwitch.press();
        aSwitch.press();
        aSwitch.press();
        aSwitch.press();
    }

}
