package Step7;

import java.util.ArrayList;

public class lesson9 {

    public static void main(String[] args) {

        // 1～10の整数をArrayListに追加
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        // 中間のインデックスを決定（下側中間を使用）
        int midIndex = numbers.size() / 2 - 1;  // index 4 (5th element)

        // 中間の要素を取得して表示
        int midValue = numbers.get(midIndex);
        System.out.println("下側中間です！");
        System.out.println("中間の要素: " + midValue);
    }
}