package Structural.Bridge;

public class Main {
    public static void main(String[] args) {
        Device tv = new TV();
        RemoteControl tvRemote = new AdvancedRemote(tv);
        tvRemote.turnOn();
        tvRemote.setVolume(15);
        ((AdvancedRemote) tvRemote).mute();
        tvRemote.turnOff();

        System.out.println();

        Device radio = new Radio();
        RemoteControl radioRemote = new AdvancedRemote(radio);
        radioRemote.turnOn();
        radioRemote.setVolume(8);
        ((AdvancedRemote) radioRemote).mute();
        radioRemote.turnOff();
    }
}
