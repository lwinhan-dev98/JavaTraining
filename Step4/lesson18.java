package Step4;

public class lesson18 {

    public static void main(String[] args) {
        int[] numbers = { 34, 12, 25, 90, 45, 8, 67, 3, 56, 18 };

        // 配列の内容を表示
        System.out.print("配列の要素: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // 最大値と最小値の計算
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        // 結果を表示
        System.out.println("配列の最大値は: " + max);
        System.out.println("配列の最小値は: " + min);
    }
}