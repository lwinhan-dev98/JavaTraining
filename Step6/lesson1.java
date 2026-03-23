package Step6;

import java.util.Scanner;

public class lesson1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ユーザーから分子と分母を入力
        System.out.print("分子を入力してください: ");
        int numerator = scanner.nextInt();

        System.out.print("分母を入力してください: ");
        int denominator = scanner.nextInt();

        try {
            // 割り算を実行
            double result = (double) numerator / denominator;
            System.out.println("結果: " + result);
        } catch (ArithmeticException e) {
            // 分母が0の場合のエラー処理
            System.out.println("エラー: 0で割ることはできません。");
        }

        // プログラム終了メッセージ
        System.out.println("プログラム終了");
    }
}