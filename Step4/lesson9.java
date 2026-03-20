package Step4;

import java.util.Scanner;

public class lesson9 {

    public static void main(String[] args) {
        // 1から5まで表示
        int i = 1;
        System.out.println("1から5まで:");
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        // 6から10まで表示
        i = 6;
        System.out.println("6から10まで:");
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        // ユーザー入力で任意の数値まで表示
        Scanner sc = new Scanner(System.in);
        System.out.print("任意の数を入力してください: ");
        int userNum = sc.nextInt();

        i = 1;
        System.out.println("ユーザー入力までカウント:");
        while (i <= userNum) {
            System.out.println(i);
            i++;
        }

        sc.close();
    }
}