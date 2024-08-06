package DesignPatterns.ObserverDP.FunctionalObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class WeatherStation {
    private float temperature;
    private List<Consumer<Float>> observers = new ArrayList<>();

    public void addObserver(Consumer<Float> observer) {
        observers.add(observer);
    }

    public void removeObserver(Consumer<Float> observer) {
        observers.remove(observer);
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Consumer<Float> observer : observers) {
            observer.accept(temperature);
        }
    }
}

