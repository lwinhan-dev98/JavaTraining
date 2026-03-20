package Step5.lesson8;

public class lesson8 {
    public static void main(String[] args) {

        // Vehicle型の変数に Bike を入れる
        Vehicle bike = new Bike();
        bike.move(); // 自転車がゆっくり進んでいます

        // Vehicle型の変数に Car を入れる
        Vehicle car = new Car();
        car.move(); // 車が速く走っています

    }
}