package Step8.lesson18; 

public class Main {
    public static void main(String[] args) {

        TemperatureSensor sensor = new TemperatureSensor();

        TemperatureObserver tv = new TVDisplay();
        TemperatureObserver phone = new SmartphoneDisplay();
        TemperatureObserver radio = new RadioDisplay(); // extra

        sensor.addObserver(tv);
        sensor.addObserver(phone);
        sensor.addObserver(radio);

        sensor.setTemperature(25);
        sensor.setTemperature(30);
    }
}