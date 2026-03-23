package Step6;

import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class lesson3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        BufferedReader reader = null;

        System.out.print("ファイルパスを入力してください: ");
        String filePath = sc.nextLine();

        try {
            File file = new File(filePath);
            reader = new BufferedReader(new FileReader(file));

            System.out.println("ファイル内容:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            System.out.println("ファイルの内容を表示しました。");

        } catch (FileNotFoundException e) {
            System.out.println("エラー: 指定されたファイルが見つかりません。");
        } catch (IOException e) {
            System.out.println("エラー: ファイルの読み取り中に問題が発生しました。");
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("エラー: ファイルを閉じる際に問題が発生しました。");
            }
        }

        System.out.println("プログラム終了");
    }
}