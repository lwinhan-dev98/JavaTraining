package Step8.lesson3;

public class BankAccount {

    private int accountNumber;
    private int balance;

    // Constructor
    public BankAccount(int accountNumber, int initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Getter
    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    // Deposit 預け入れ
    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + "円を預け入れました。");
        } else {
            System.out.println("預け入れ金額が不正です。");
        }
    }

    // Withdraw 引き出し
    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + "円を引き出しました。");
        } else if (amount <= 0) {
            System.out.println("引き出し金額が不正です。");
        } else {
            System.out.println("残高が不足しています。");
        }
    }
}