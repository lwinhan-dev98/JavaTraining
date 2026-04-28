package Step8.lesson18; 

import java.util.ArrayList;
import java.util.List;

public class TemperatureSensor {

    private List<TemperatureObserver> observers = new ArrayList<>();
    private float temperature;

    public void addObserver(TemperatureObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(TemperatureObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (TemperatureObserver obs : observers) {
            obs.update(temperature);
        }
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        System.out.println("\nTemperature updated: " + temperature + "°C");
        notifyObservers();
    }
}