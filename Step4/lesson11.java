package Step4;

import java.util.Scanner;

public class lesson11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        // 2以上の数字を入力するまでくり返す
        System.out.print("整数値を入力してください: ");
        num = sc.nextInt();

        while (num < 2) {
            System.out.println("2以上の整数を入力してください");
            System.out.print("整数値を入力してください: ");
            num = sc.nextInt();
        }

        boolean isPrime = true; // 素数かどうかを判定するフラグ

        // 2から num-1 まで割れるかチェック
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false; // 割れたら素数ではない
                break;
            }
        }

        // 結果を表示
        if (isPrime) {
            System.out.println("入力された数値 " + num + " は素数です");
        } else {
            System.out.println("入力された数値 " + num + " は素数ではありません");
        }

        sc.close();
    }
}