package DesignPatterns.ObserverDP.ClassObserver;

public class WeatherStation extends Subject {
    private float temperature;

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers(temperature);
    }
}
