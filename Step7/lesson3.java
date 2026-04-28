package Step7;

import java.util.ArrayList;

public class lesson3 {

    public static void main(String[] args) {

        // ArrayListの作成
        ArrayList<Integer> numbers = new ArrayList<>();

        // 1～5を追加
        for (int i = 1; i <= 5; i++) {
            numbers.add(i);
        }

        // 値「3」を削除(value 3)
        numbers.remove(Integer.valueOf(3));

        // 3番目の要素を削除（index 2）// Array Index starts from index 0
        numbers.remove(2);

        // 表示
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}