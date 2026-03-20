package Step5.lesson6;

// SquareクラスはShapeを継承
public class Square extends Shape {

    private double side; // 一辺の長さ

    // コンストラクタ
    public Square(double side) {
        this.side = side;
    }

    // 面積を計算するメソッドをオーバーライド
    @Override
    public double getArea() {
        return side * side;
    }
}