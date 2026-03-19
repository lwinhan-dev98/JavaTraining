package Step4;

public class lesson3 {
    public static void main(String[] args) {
        // ①: float型の変数に3.14を代入し、double型の変数に123.456789を代入
        float fNum = 3.14f;
        double dNum = 1010123.456789123123456789;

        // ②: 変数に代入された値を表示
        System.out.println("float: " + fNum);
        System.out.println("double: " + dNum);

        // ③: float型の変数に10.5を新たに代入し、double型の変数に0.00123を新たに代入
        fNum = 10.5f;
        dNum = 0.00123;

        // ④: 変数を掛け合わせた結果をdouble型の変数に代入し、その結果を表示
        double result = fNum * dNum;
        System.out.println("Multiplication result: " + result);

        // ⑤: 説明するコメントを記述
        float fNumTest = 123.123456789f;
        double dNumTest = 123.123456789123456789;
        System.out.println("float Test: " + fNumTest);
        System.out.println("double Test: " + dNumTest);

        // doubleとfloatを掛け算した結果は double 型に入ります。
        // なぜなら double は float より大きいメモリを使うからです。
        // double は 64-bit のメモリを使い、より多くの桁を正確に表せます。
        // 約15～16桁まで正確です。
        // float は 32-bit のメモリを使い、少ない桁しか正確に表せません。
        // 約6～7桁まで正確です。
    }
}
