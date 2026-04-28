package Step7;

import java.util.ArrayList;

public class lesson2 {

    public static void main(String[] args) {

        // ArrayListの作成
        ArrayList<Integer> numbers = new ArrayList<>();

        // 1から5まで追加
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // 表示
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}