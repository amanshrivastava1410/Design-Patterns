package Behavioral.Observer;

public class StatisticsDisplay implements Observer {
    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println("Statistics: Temperature: " + temperature + "°C, Humidity: " + humidity + "%, Pressure: " + pressure + " hPa");
    }
}
