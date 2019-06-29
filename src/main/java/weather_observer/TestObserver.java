package main.java.weather_observer;

public class TestObserver {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        currentConditionsDisplay.update(20, 30, 110);

        currentConditionsDisplay.display();
    }
}