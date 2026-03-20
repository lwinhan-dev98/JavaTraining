package Step4;

import java.util.Scanner;

public class lesson13 {

    public static void main(String[] args) {

        // 0～100のランダム整数
        int targetNumber = (int) (Math.random() * 101);

        Scanner sc = new Scanner(System.in); // 入力を受け取る準備
        int guess; // ユーザーが入力する数
        int count = 0;

        System.out.println("0～100の間の整数を入力してください: ");

        while (true) {
            guess = sc.nextInt();
            count++;

            if (guess > targetNumber) {
                System.out.println("小さい数を試してください。");
            } else if (guess < targetNumber) {
                System.out.println("大きい数を試してください。");
            } else {
                System.out.println("正解です！あなたは" + count + "回で当てました。");
                break; // 正解で終了
            }

            System.out.println("0～100の間の整数を入力してください: ");
        }

        sc.close();
    }
}