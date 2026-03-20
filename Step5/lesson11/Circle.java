package Step5.lesson11;

// 円（えん）クラス
public class Circle {

    // 半径（はんけい）をprivateで定義
    private double radius;

    // 半径のsetter（設定）
    public void setRadius(double radius) {
        // エラーチェック
        if (radius < 0) {
            System.out.println("半径は0以上の値を指定してください。");
        } else {
            this.radius = radius;
        }
    }

    // 半径のgetter（取得）
    public double getRadius() {
        return this.radius;
    }

    // 面積を計算するメソッド
    public double calculateArea() {
        return this.radius * this.radius * 3.14;
    }
}