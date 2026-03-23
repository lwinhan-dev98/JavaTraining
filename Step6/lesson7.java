package Step6;

import java.util.Scanner;

public class lesson7 {

    // 入力値をチェックするメソッド
    public static void validateInput(int value) {

        // 値が0以下のとき、エラーを出します
        if (value <= 0) {
            throw new IllegalArgumentException("入力値は1以上である必要があります。");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 数値を入力
        System.out.print("数値を入力してください: ");
        int number = sc.nextInt();

        try {
            // メソッドを呼び出
            validateInput(number);

            // 正常な場合、結果を表示
            System.out.println("入力値は有効です: " + number);

        } catch (IllegalArgumentException e) {
            // エラーをキャッチして表示
            System.out.println("エラー: " + e.getMessage());
        }

        // プログラムの終了
        System.out.println("プログラム終了");
    }
}