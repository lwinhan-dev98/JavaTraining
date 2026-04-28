package Step8.lesson19;

public class BitcoinPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Processing payment of $" + amount + " using Bitcoin...");
    }
}