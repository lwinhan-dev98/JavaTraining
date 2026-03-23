package Step6;

import java.util.Scanner;

// ① カスタム例外クラス
class InvalidValueException extends Exception {
    public InvalidValueException(String message) {
        super(message);
    }
}

public class lesson4 {

    // ② 例外をスローするメソッド
    public static void checkValue(int value) throws InvalidValueException {
        if (value < 10) {
            throw new InvalidValueException(
                "エラー: 入力された数値が小さすぎます。10以上の値を入力してください。"
            );
        }
    }

    // ③ 例外を処理するメインメソッド
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("数値を入力してください: ");
        int number = sc.nextInt();

        try {
            checkValue(number);
            System.out.println("入力された数値は: " + number);
        } catch (InvalidValueException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("プログラム終了");
    }
}