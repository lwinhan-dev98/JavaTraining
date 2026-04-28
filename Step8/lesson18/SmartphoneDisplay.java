package Step8.lesson18; 

public class SmartphoneDisplay implements TemperatureObserver {

    public void update(float temperature) {
        System.out.println("Smartphone Display: Temperature=" + temperature + "°C");
    }
}