package Step5.lesson8;

// Vehicle を継承した Car クラス
public class Car extends Vehicle {

    @Override
    public void move() {

        // 車の動き
        System.out.println("車が速く走っています");
    }
}