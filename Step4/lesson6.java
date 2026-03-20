package Step4;

import java.util.Scanner;

public class lesson6 {
    public static void main(String[] args) {
        // 最初の3つの整数
        int num1 = 45;
        int num2 = 67;
        int num3 = 32;

        // if文で大きい値を判定し
        int max = num1; // 仮にnum1を最大とする
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }

        // 最大値表示
        System.out.println("最も大きい値は: " + max);

        // ユーザー入力
        Scanner sc = new Scanner(System.in);
        System.out.print("1つ目の整数を入力してください: ");
        int input1 = sc.nextInt();
        System.out.print("2つ目の整数を入力してください: ");
        int input2 = sc.nextInt();
        System.out.print("3つ目の整数を入力してください: ");
        int input3 = sc.nextInt();

        // ユーザー入力で大きい値を判定し
        int userMax = input1;
        if (input2 > userMax) {
            userMax = input2;
        }
        if (input3 > userMax) {
            userMax = input3;
        }

        System.out.println("最も大きい値は: " + userMax);

        sc.close();
    }

}