package DesignPatterns.ObserverDP.ClassObserver;

public class WindowDisplay implements Observer {
    private WeatherStation weatherStation;

    public WindowDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        this.weatherStation.attach(this);
    }

    @Override
    public void update(float temperature) {
        System.out.println("Window Display: Temperature updated to " + temperature);
    }
}