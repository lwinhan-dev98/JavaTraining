package Step5.lesson6;

// CircleクラスはShapeを継承
public class Circle extends Shape {

    private double radius; // 半径

    // コンストラクタ
    public Circle(double radius) {
        this.radius = radius;
    }

    // 面積を計算するメソッドをオーバーライド
    @Override
    public double getArea() {
        return radius * radius * 3.14;
    }
}