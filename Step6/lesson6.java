package Step6;

import java.util.Scanner;

public class lesson6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 配列
        int[] numbers = {10, 20, 30};

        // 配列の内容を表示
        System.out.println("配列の内容: [10, 20, 30]");

        // インデックスを入力
        System.out.print("配列のインデックスを入力してください: ");
        int index = sc.nextInt();

        // 分母を入力
        System.out.print("割り算の分母を入力してください: ");
        int denominator = sc.nextInt();

        try {
            // 配列の値を取得
            int value = numbers[index];

            // 割り算
            double result = (double) value / denominator;

            // 結果を表示
            System.out.println("計算結果: " + result);

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {

            // 0で割ったときのエラー
            if (e instanceof ArithmeticException) {
                System.out.println("エラー: 0で割ることはできません。");
            }

            // インデックスが範囲外のときのエラー
            else if (e instanceof ArrayIndexOutOfBoundsException) {
                System.out.println("エラー: 配列のインデックスが範囲外です。");
            }
        }

        // プログラム終了
        System.out.println("プログラム終了");
    }
}