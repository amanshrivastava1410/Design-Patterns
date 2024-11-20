package Structural.Facade;

public class HomeAutomationFacade {
    private Lights lights;
    private Thermostat thermostat;
    private MusicSystem musicSystem;

    public HomeAutomationFacade(Lights lights, Thermostat thermostat, MusicSystem musicSystem) {
        this.lights = lights;
        this.thermostat = thermostat;
        this.musicSystem = musicSystem;
    }

    public void startMorningRoutine() {
        System.out.println("Starting morning routine...");
        lights.on();
        thermostat.setTemperature(22);
        musicSystem.playMusic();
    }

    public void endDay() {
        System.out.println("Ending the day...");
        lights.off();
        thermostat.setTemperature(18);
        musicSystem.stopMusic();
    }
}