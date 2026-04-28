package Step7;

import java.util.Stack;

public class lesson30 {

    public static void main(String[] args) {

        // Stackを作成（課題29と同じ）
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        // 一番上の要素を取り出す
        int poppedValue = stack.pop();

        // 取り出した値を表示
        System.out.println("取り出した値: " + poppedValue);

        // 残っているStackを表示
        System.out.println("現在のStack: " + stack);
    }
}