package Step7;

import java.util.ArrayList;

public class lesson5 {

    public static void main(String[] args) {

        // 1～5の整数を追加
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(i);
        }

        // 逆順で表示
        System.out.println("逆順で表示:");
        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.println(numbers.get(i));
        }

        // 元のリストは変更されていないことを確認
        System.out.println("元の順番:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}