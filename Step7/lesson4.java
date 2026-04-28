package Step7;

import java.util.ArrayList;
import java.util.Scanner;

public class lesson4 {

    public static void main(String[] args) {

        // 1～10の整数を追加
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        // ユーザー入力
        Scanner sc = new Scanner(System.in);
        System.out.print("検索する整数を入力してください: ");
        int target = sc.nextInt();

        // 検索
        if (numbers.contains(target)) {
            System.out.println(target + "は含まれています");
        } else {
            System.out.println(target + "は含まれていません");
        }

        sc.close();
    }
}