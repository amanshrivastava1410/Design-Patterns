package Behavioral.Command;

import Behavioral.Command.Command.*;
import Behavioral.Command.Receiver.*;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Fan fan = new Fan();
        AirConditioner airConditioner = new AirConditioner();

        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);
        FanOnCommand fanOn = new FanOnCommand(fan);
        FanOffCommand fanOff = new FanOffCommand(fan);
        ACOnCommand acOn = new ACOnCommand(airConditioner);
        ACOffCommand acOff = new ACOffCommand(airConditioner);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(0, lightOn, lightOff);
        remote.setCommand(1, fanOn, fanOff);
        remote.setCommand(2, acOn, acOff);

        System.out.println("Pressing buttons on the remote control:");
        remote.pressOnButton(0);
        remote.pressOnButton(1);
        remote.pressOnButton(2);

        System.out.println("\nPressing off buttons:");
        remote.pressOffButton(0);
        remote.pressOffButton(1);
        remote.pressOffButton(2);
    }
}
