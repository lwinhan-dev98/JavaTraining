package Step7;

import java.util.LinkedList;

public class lesson6 {

    public static void main(String[] args) {

        // LinkedListの作成
        LinkedList<String> list = new LinkedList<>();

        // 文字列を追加
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        // 2番目に "X" を挿入
        list.add(1, "X");

        // 4番目の要素を削除
        list.remove(3);

        // LinkedListの内容を表示
        System.out.println("最終的なLinkedListの内容:");
        for (String item : list) {
            System.out.println(item);
        }
    }
}