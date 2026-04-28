package Step8.lesson9;

public class Client {

    public static void main(String[] args) {

        // original : 元となる図形を作成
        Shape originalCircle = new Circle("Circle1", "Red"); // Drawing Circle [name=Circle1, color=Red]

        Shape originalRectangle = new Rectangle("Rectangle1", "Blue"); // Drawing Rectangle [name=Rectangle1,
                                                                       // color=Blue]

        originalCircle.draw();
        originalRectangle.draw();

        // clone : 複製された図形を作成
        Shape clonedCircle = originalCircle.clone();
        Shape clonedRectangle = originalRectangle.clone();

        // クローンを変更して元の図形に影響がないことを確認
        clonedCircle.draw();
        clonedRectangle.draw();
    }
}