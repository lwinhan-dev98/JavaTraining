package Step5.lesson12;

// 銀行口座クラス
public class BankAccount {

    // 残高（ざんだか）をprivateで定義
    private double balance = 0;

    // 入金(にゅうきん)メソッド
    public void deposit(double amount) {

        // チェック
        if (amount <= 0) {
            System.out.println("入金額は1円以上にしてください。");
        } else {
            balance += amount;
            System.out.println(amount + "円を入金しました。");
        }
    }

    // 出金(しゅっきん)メソッド
    public void withdraw(double amount) {

        // チェック
        if (amount <= 0 || amount > balance) {
            System.out.println("出金は1円以上で、残高以内で行ってください。");
        } else {
            balance -= amount;
            System.out.println(amount + "円を出金しました。");
        }
    }

    // 残高を表示するメソッド
    public void showBalance() {
        System.out.println("現在の残高: " + (int) balance + "円");
    }
}