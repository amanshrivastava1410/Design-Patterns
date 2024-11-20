package Structural.Facade;

public class Main {
    public static void main(String[] args) {
        Lights lights = new Lights();
        Thermostat thermostat = new Thermostat();
        MusicSystem musicSystem = new MusicSystem();

        HomeAutomationFacade homeAutomation = new HomeAutomationFacade(lights, thermostat, musicSystem);

        homeAutomation.startMorningRoutine();

        System.out.println();

        homeAutomation.endDay();
    }
}