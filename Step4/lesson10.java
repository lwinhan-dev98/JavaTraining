package Step4;

public class lesson10 {

    public static void main(String[] args) {

        // 1から100まで繰り返す
        for (int i = 1; i <= 100; i++) {

            // 3と5の両方の倍数で「FizzBuzz」
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            // 3の倍数で Fizz
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            // 5の倍数で Buzz
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            // それ以外
            else {
                System.out.println(i);
            }
        }
    }
}