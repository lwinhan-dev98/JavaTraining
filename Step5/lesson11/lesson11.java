package Step5.lesson11;

public class lesson11 {
    public static void main(String[] args) {

        // Circleオブジェクトを作成
        Circle circle = new Circle();

        // 半径を設定
        circle.setRadius(5);

        // 半径を表示
        System.out.println("半径: " + circle.getRadius());

        // 面積を表示
        System.out.println("面積: " + circle.calculateArea());
    }
}