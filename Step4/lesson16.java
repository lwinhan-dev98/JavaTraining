package Step4;

public class lesson16 {

    public static void main(String[] args) {

        // 長さ10の配列
        int[] numbers = new int[10];

        // 配列にランダムな整数を代入
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 101); // 0～100の整数
        }

        // 配列の要素を表示
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("配列の要素 " + (i + 1) + ": " + numbers[i]);
        }
    }
}