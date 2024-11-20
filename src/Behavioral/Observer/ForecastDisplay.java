package Behavioral.Observer;

public class ForecastDisplay implements Observer {
    private float pressure;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.pressure = pressure;
        display();
    }

    public void display() {
        if (pressure > 1013.25) {
            System.out.println("Forecast: Improving weather on the way!");
        } else if (pressure == 1013.25) {
            System.out.println("Forecast: Fair weather.");
        } else {
            System.out.println("Forecast: Watch out for a storm!");
        }
    }
}