package Step4;

public class lesson14 {
    public static void main(String[] args) {
        // 長さ5の整数型配列を宣言
        int[] numbers = new int[5];

        // 配列に1～5を代入
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        // 配列の要素を出力
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

}