package Step5.lesson8;

// Vehicle を継承した Bike クラス
public class Bike extends Vehicle {

    @Override
    public void move() {

        // 自転車の動き
        System.out.println("自転車がゆっくり進んでいます");
    }
}