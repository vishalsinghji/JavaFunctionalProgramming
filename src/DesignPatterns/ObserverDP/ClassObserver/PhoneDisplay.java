package DesignPatterns.ObserverDP.ClassObserver;

public class PhoneDisplay implements Observer {
    private WeatherStation weatherStation;

    public PhoneDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        this.weatherStation.attach(this);
    }

    @Override
    public void update(float temperature) {
        System.out.println("Phone Display: Temperature updated to " + temperature);
    }
}
