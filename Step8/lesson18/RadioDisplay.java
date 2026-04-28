package Step8.lesson18; 

public class RadioDisplay implements TemperatureObserver {

    public void update(float temperature) {
        System.out.println("Radio Display: Current Temperature -> " + temperature + "°C");
    }
}