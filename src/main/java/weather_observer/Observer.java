package main.java.weather_observer;

public interface Observer {
    void update(float temperature, float humidity, float pressure);
}
