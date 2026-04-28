package Step8.lesson7;

// クライアントコード
public class Main {

    public static void main(String[] args) {

        // Hot drinks
        DrinkFactory hotFactory = new HotDrinkFactory();
        Coffee hotCoffee = hotFactory.createCoffee();
        Tea hotTea = hotFactory.createTea();

        hotCoffee.prepare();
        hotTea.prepare();

        // Cold drinks
        DrinkFactory coldFactory = new ColdDrinkFactory();
        Coffee icedCoffee = coldFactory.createCoffee();
        Tea icedTea = coldFactory.createTea();

        icedCoffee.prepare();
        icedTea.prepare();
    }
}