package Step8.lesson19;

public class PaymentProcessor {
    private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void executePayment(int amount) {
        if (strategy != null) {
            strategy.pay(amount);
        } else {
            System.out.println("No payment method selected.");
        }
    }
}