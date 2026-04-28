package Step8.lesson7;

public class HotDrinkFactory implements DrinkFactory {

    public Coffee createCoffee() {
        return new HotCoffee();
    }

    public Tea createTea() {
        return new HotTea();
    }
}