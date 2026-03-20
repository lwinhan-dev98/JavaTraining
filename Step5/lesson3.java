package Step5;

// 銀行口座クラス
class BankAccount {

    // 残高
    private int balance;

    // コンストラクタ
    public BankAccount() {
        balance = 0; // （残高の初期値は0にすること）
    }

    // 預け入れメソッド
    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + "円を預け入れました。");
        } else {
            System.out.println("預け入れ金額は1円以上にしてください。");
        }
    }

    // 引き出しメソッド
    public void withdraw(int amount) {
        if (amount <= 0 || amount > balance) {
            System.out.println("引き出しは1円以上で、残高以内で行ってください。");
        } else {
            balance -= amount;
            System.out.println(amount + "円を引き出しました。");
        }
    }

    // 現在の残高を表示するメソッド
    public void showBalance() {
        System.out.println("現在の残高: " + balance + "円");
    }
}

// lesson3のメインクラス
public class lesson3 {

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();

        // 初期残高
        myAccount.showBalance();

        // 預け入れ
        myAccount.deposit(5000);
        myAccount.showBalance();

        // 引き出し
        myAccount.withdraw(2000);
        myAccount.showBalance();

        // 残高不足の引き出し
        myAccount.withdraw(5000);
    }
}