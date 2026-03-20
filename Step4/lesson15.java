package Step4;

import java.util.Scanner;

public class lesson15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 長さ5の文字列型配列を宣言
        String[] names = new String[5];

        System.out.println("5人の名前を入力してください");

        // ユーザーからの入力を配列に格納
        for (int i = 0; i < names.length; i++) {
            System.out.print("名前" + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        System.out.println("\n名前の表示：");

        // 配列の名前を順番に表示
        for (int i = 0; i < names.length; i++) {
            System.out.println("名前" + (i + 1) + ": " + names[i]);
        }

        sc.close();
    }
}