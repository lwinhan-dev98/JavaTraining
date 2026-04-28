package Step7;

import java.util.HashSet;

public class lesson10 {

    public static void main(String[] args) {

        // HashSetを作成
        HashSet<String> letters = new HashSet<>();

        // "A,B,C" を追加
        letters.add("A");
        letters.add("B");
        letters.add("C");

        // 重複する "A" と "B" を追加してみる
        letters.add("A");
        letters.add("B");

        // HashSetの内容を表示（重複が登録されないことを確認せ）
        System.out.println("HashSetの内容:");
        for (String s : letters) {
            System.out.println(s);
        }
    }
}