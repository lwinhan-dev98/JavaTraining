package Step4;

import java.util.Scanner;

public class lesson12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";

        // ユーザーが "quit" を入力するまで繰り返す
        while (!input.equals("quit")) {
            System.out.print("文字列を入力してください（終了するには 'quit' と入力）: ");
            input = sc.nextLine();

            if (!input.equals("quit")) {
                System.out.println("あなたが入力した文字列: " + input);
            }
        }

        System.out.println("プログラムを終了します");
        sc.close();
    }
}