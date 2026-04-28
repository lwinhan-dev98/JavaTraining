package Step8.lesson18; 

public class TVDisplay implements TemperatureObserver {

    public void update(float temperature) {
        System.out.println("TV Display: Temperature=" + temperature + "°C");
    }
}