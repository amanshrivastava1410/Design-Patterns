package Behavioral.Command.Command;

import Behavioral.Command.Receiver.AirConditioner;

public class ACOffCommand implements Command {
    private AirConditioner airConditioner;

    public ACOffCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnOff();
    }
}
