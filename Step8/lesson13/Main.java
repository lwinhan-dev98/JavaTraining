package Step8.lesson13;

public class Main {

    public static void main(String[] args) {

        Coffee coffee = new BasicCoffee();
        System.out.printf("%s ($%.2f)\n", coffee.getDescription(), coffee.getCost());

        coffee = new MilkDecorator(coffee);
        System.out.printf("Adding Milk: %s ($%.2f)\n", coffee.getDescription(), coffee.getCost());

        coffee = new SugarDecorator(coffee);
        System.out.printf("Adding Sugar: %s ($%.2f)\n", coffee.getDescription(), coffee.getCost());

        coffee = new WhippedCreamDecorator(coffee);
        System.out.printf("Adding Whipped Cream: %s ($%.2f)\n", coffee.getDescription(), coffee.getCost());
    }
}