package Step6;

import java.util.Scanner;

public class lesson5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 数値を入力します
        System.out.print("数値を入力してください: ");
        int number = sc.nextInt();

        try {
            // 数値が10以下のとき、エラーを出します
            if (number <= 10) {
                throw new IllegalArgumentException("入力値が10以下です。");
            }

            // 正常な場合、数値を表示します
            System.out.println("入力された数値は: " + number);

        } catch (IllegalArgumentException e) {
            // エラーをキャッチして、メッセージを表示します
            System.out.println("スローされた例外をキャッチしました: " + e.getMessage());

            try {
                // 数値が5以下のとき、もう一度エラーを出します
                if (number <= 5) {
                    throw new IllegalArgumentException("入力値が5以下です。");
                }
            } catch (IllegalArgumentException re) {
                // 再スローされたエラーを表示します
                System.out.println("再スローされた例外を処理します: " + re.getMessage());
            }
        }

        // プログラムの終了
        System.out.println("プログラム終了");
    }
}