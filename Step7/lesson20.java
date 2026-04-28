package Step7;

import java.util.HashMap;
import java.util.Map;

public class lesson20 {
    public static void main(String[] args) {

        // HashMapを作成（キー: 名前、値: 年齢）
        HashMap<String, Integer> ages = new HashMap<>();

        // 名前と年齢を格納
        ages.put("Alice", 20);
        ages.put("Bob", 25);
        ages.put("Charlie", 30);

        // 登録した全要素を表示
        System.out.println("HashMapの内容:");
        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
