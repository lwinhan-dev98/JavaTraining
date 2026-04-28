package Step8.lesson7;

public class ColdDrinkFactory implements DrinkFactory {

    public Coffee createCoffee() {
        return new IcedCoffee();
    }

    public Tea createTea() {
        return new IcedTea();
    }
}