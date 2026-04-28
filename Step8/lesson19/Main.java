package Step8.lesson19;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        processor.setPaymentStrategy(new CreditCardPayment());
        processor.executePayment(100);

        processor.setPaymentStrategy(new PayPalPayment());
        processor.executePayment(200);

        processor.setPaymentStrategy(new BankTransferPayment());
        processor.executePayment(300);

        processor.setPaymentStrategy(new BitcoinPayment());
        processor.executePayment(400);
    }
}