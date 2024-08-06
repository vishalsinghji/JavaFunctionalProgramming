package DesignPatterns.ObserverDP.ClassObserver;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        PhoneDisplay phoneDisplay = new PhoneDisplay(weatherStation);
        WindowDisplay windowDisplay = new WindowDisplay(weatherStation);

        weatherStation.setTemperature(25.3f);
        weatherStation.setTemperature(27.0f);
    }
}

