package Step8.lesson8;

public class Client {

    public static void main(String[] args) {

        Pizza simplePizza = new Pizza.PizzaBuilder("Medium", "Thin Crust")
                .addCheese(true)
                .build();

        Pizza customPizza = new Pizza.PizzaBuilder("Large", "Thick Crust")
                .addCheese(true)
                .addPepperoni(true)
                .addOlives(true)
                .build();

        Pizza basicPizza = new Pizza.PizzaBuilder("Small", "Thin Crust")
                .build();

        System.out.println(simplePizza);
        System.out.println(customPizza);
        System.out.println(basicPizza);
    }
}