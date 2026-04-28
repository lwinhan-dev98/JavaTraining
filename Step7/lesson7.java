package Step7;

import java.util.ArrayList;
import java.util.Collections;

public class lesson7 {

    public static void main(String[] args) {

        // 1～10を追加
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        // ランダムに並び替え
        Collections.shuffle(numbers);

        // 表示
        System.out.println("シャッフル後のリスト:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}