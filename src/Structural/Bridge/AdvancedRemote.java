package Structural.Bridge;

public class AdvancedRemote extends RemoteControl {

    public AdvancedRemote(Device device) {
        super(device);
    }

    @Override
    public void turnOn() {
        device.turnOn();
    }

    @Override
    public void turnOff() {
        device.turnOff();
    }

    @Override
    public void setVolume(int volume) {
        device.setVolume(volume);
    }

    public void mute() {
        System.out.println("Muting the device.");
    }
}