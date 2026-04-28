package Step7;

import java.util.ArrayList;

public class lesson1 {

    public static void main(String[] args) {

        // ArrayListの作成
        ArrayList<String> fruits = new ArrayList<>();

        // 要素の追加
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grape");

        // 要素の表示（1回目）
        System.out.println("=== 1回目 ===");
        for (String fruit : fruits) {
            System.out.println("フルーツ: " + fruit);
        }

        // 要素の追加（Mango）
        fruits.add("Mango");

        // 要素の表示（2回目）
        System.out.println("=== 2回目 ===");
        for (String fruit : fruits) {
            System.out.println("フルーツ: " + fruit);
        }
    }
}