package Behavioral.Observer;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditions = new CurrentConditionsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();

        weatherData.registerObserver(currentConditions);
        weatherData.registerObserver(forecastDisplay);
        weatherData.registerObserver(statisticsDisplay);

        System.out.println("Setting new weather data....");
        weatherData.setWeatherData(25.5f, 65.0f, 1013.0f);
        System.out.println("\n----- Updating Weather Data -----");
        weatherData.setWeatherData(30.0f, 70.0f, 1015.0f);
    }
}