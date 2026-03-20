package Step4;

import java.util.Scanner;

public class lesson4 {
    public static void main(String[] args) {
        // 最初の2つの整数
        int num1 = 15;
        int num2 = 4;

        // 商と余りの計算
        int quotient = num1 / num2;
        int remainder = num1 % num2;

        // 表示
        System.out.println("商: " + quotient + ", 余り: " + remainder);

        // ユーザーからの入力
        Scanner sc = new Scanner(System.in);
        System.out.print("1つ目の整数を入力してください: ");
        int input1 = sc.nextInt();
        System.out.print("2つ目の整数を入力してください: ");
        int input2 = sc.nextInt();

        // ユーザー入力での計算
        int userInputQuotient = input1 / input2;
        int userInputRemainder = input1 % input2;

        // 結果表示
        System.out.println("商: " + userInputQuotient + ", 余り: " + userInputRemainder);

        sc.close();
    }

}