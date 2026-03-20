package Step5;

// 車を表すクラス
class Car {

    // 速度 : そくど
    private int speed;

    // コンストラクタ
    public Car() {
        speed = 0;
    }

    // 加速メソッド（10ずつ速度を増やす）: かそく
    public void accelerate() {
        speed += 10;
    }

    // 減速メソッド（10ずつ速度を減らす、0より下がらない）: げんそく
    public void brake() {
        speed -= 10;
        if (speed < 0) {
            speed = 0;
        }
    }

    // 現在の速度を表示するメソッド
    public void showSpeed() {
        System.out.println("現在の速度: " + speed + " km/h");
    }
}

// 課題 2のメインクラス
public class lesson2 {

    public static void main(String[] args) {
        // Carオブジェクトを作成
        Car myCar = new Car();

        // 初期速度を表示
        myCar.showSpeed();

        // 加速
        myCar.accelerate();
        myCar.showSpeed();

        // 減速
        myCar.brake();
        myCar.showSpeed();
    }
}