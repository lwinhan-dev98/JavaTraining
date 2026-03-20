package Step5.lesson6;

public class lesson6 {

    public static void main(String[] args) {

        // 半径5の円
        Shape circle = new Circle(5);
        System.out.println("円の面積: " + circle.getArea());

        // 一辺4の正方形
        Shape square = new Square(4);
        System.out.println("正方形の面積: " + square.getArea());
    }
}