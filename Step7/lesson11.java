package Step7;

import java.util.HashSet;

public class lesson11 {

    public static void main(String[] args) {

        // HashSetを作成
        HashSet<String> languages = new HashSet<>();

        // 複数の文字列を追加
        languages.add("Java"); // 必ず "Java" を含む
        languages.add("Python");
        languages.add("C++");
        languages.add("Go");

        // "Java" を削除
        languages.remove("Java");

        // HashSetの内容を表示
        System.out.println("HashSetの内容（Javaは削除済み）:");
        for (String lang : languages) {
            System.out.println(lang);
        }
    }
}