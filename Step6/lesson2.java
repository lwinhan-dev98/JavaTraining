package Step6;

import java.util.Scanner;

public class lesson2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // ユーザーから文字列を入力
            System.out.print("文字列を入力してください: ");
            String input = sc.nextLine();

            // ユーザーからインデックスを入力
            System.out.print("インデックスを入力してください: ");
            int index = sc.nextInt();

            // 指定されたインデックスの文字を取得
            char c = input.charAt(index);
            System.out.println("指定されたインデックスの文字: " + c);

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("エラー: インデックスが文字列の範囲外です。");
        } catch (NullPointerException e) {
            System.out.println("エラー: nullの値に操作を行うことはできません。");
        }

        // プログラム終了
        System.out.println("プログラム終了");
    }
}