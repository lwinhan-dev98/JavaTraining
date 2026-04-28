package Step7;

import java.util.Stack;

public class lesson29 {

    public static void main(String[] args) {

        // Stackを作成
        Stack<Integer> stack = new Stack<>();

        // 1～5を順番にプッシュ
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        // Stackの内容を表示
        System.out.println("Stackの内容: " + stack);
    }
}