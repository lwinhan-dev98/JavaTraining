package Step7;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class lesson8 {

    public static void main(String[] args) {

        // ArrayListを作成し重複を含む
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(5);

        // LinkedHashSetで重複を削除
        LinkedHashSet<Integer> uniqueSet = new LinkedHashSet<>(numbers);

        // ArrayListに戻す
        ArrayList<Integer> uniqueList = new ArrayList<>(uniqueSet);

        // 表示
        System.out.println("重複を削除したリスト:");
        for (int num : uniqueList) {
            System.out.println(num);
        }
    }
}