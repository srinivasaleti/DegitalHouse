package com.tw;

//Represents entry point for app
class DigitalHouseApp {

    public static void main(String[] args) {
        IO consoleIO = new ConsoleIO(System.out);
        workWithFan(consoleIO);
        workWithLight(consoleIO);
    }

    private static void workWithFan(IO consoleIO) {
        consoleIO.println("Fan::");
        ElectricalDevice fan = new Fan(consoleIO);
        Switch aSwitch = new Switch(fan);

        aSwitch.press();
        aSwitch.press();
        consoleIO.println("");
    }

    private static void workWithLight(IO consoleIO) {
        consoleIO.println("Light::");
        ElectricalDevice light = new Light(consoleIO);
        Switch aSwitch = new Switch(light);

        aSwitch.press();
        aSwitch.press();
        aSwitch.press();
        consoleIO.println("");
    }

}
