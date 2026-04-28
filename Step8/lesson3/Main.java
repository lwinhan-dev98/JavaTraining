package Step8.lesson3;

public class Main {

    public static void main(String[] args) {

        BankAccount acc = new BankAccount(123456, 10000);

        System.out.println("口座番号: " + acc.getAccountNumber());
        System.out.println("残高: " + acc.getBalance());

        acc.deposit(5000);
        acc.withdraw(3000);

        System.out.println("最終残高: " + acc.getBalance());

    }
}