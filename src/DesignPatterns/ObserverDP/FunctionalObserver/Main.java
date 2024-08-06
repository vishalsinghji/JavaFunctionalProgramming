package DesignPatterns.ObserverDP.FunctionalObserver;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        Consumer<Float> phoneDisplay = temp -> System.out.println("Phone Display: Temperature updated to " + temp);
        Consumer<Float> windowDisplay = temp -> System.out.println("Window Display: Temperature updated to " + temp);

        weatherStation.addObserver(phoneDisplay);
        weatherStation.addObserver(windowDisplay);

        weatherStation.setTemperature(25.3f);
        weatherStation.setTemperature(27.0f);
    }
}