package Behavioral.Command.Command;

import Behavioral.Command.Receiver.AirConditioner;

public class ACOnCommand implements Command {
    private AirConditioner airConditioner;

    public ACOnCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnOn();
    }
}
