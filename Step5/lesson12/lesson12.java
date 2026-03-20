package Step5.lesson12;

public class lesson12 {
    public static void main(String[] args) {

        // BankAccountオブジェクトを作成
        BankAccount account = new BankAccount();

        // 初期残高を表示
        account.showBalance();

        // 入金
        account.deposit(5000);
        account.showBalance();

        // 出金
        account.withdraw(2000);
        account.showBalance();

        // 7000円を出金（残高不足のエラー）
        account.withdraw(7000);

        // -500円を入金（エラー）
        account.deposit(-500);
    }
}