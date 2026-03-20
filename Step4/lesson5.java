package Step4;

public class lesson5 {
    public static void main(String[] args) {
        // 変数の宣言と代入
        int num1 = 10;
        int num2 = 20;

        // 入れ替え前の表示
        System.out.println("値を交換する前: 変数1 = " + num1 + ", 変数2 = " + num2);

        // 2つの変数の値を入れ替える処理
        int temp = num1; // 一時変数にnum1を入れる
        num1 = num2; 
        num2 = temp;

        // 入れ替え後の表示
        System.out.println("値を交換した後: 変数1 = " + num1 + ", 変数2 = " + num2);
    }

}