package Step5;

// 犬を表すクラス
class Dog {

    // 名前と年齢
    private String name;
    private int age;

    // コンストラクタ（名前と年齢を設定）
    public Dog(String dogName, int dogAge) {
        name = dogName;
        age = dogAge;
    }

    // 名前と年齢を表示するメソッド
    public void showInfo() {
        System.out.println("名前: " + name);
        System.out.println("年齢: " + age + "歳");
    }
}

// 課題 1のメインクラス
public class lesson1 {

    public static void main(String[] args) {
        // Dogオブジェクトを作成
        Dog myDog = new Dog("Pochi", 3);

        // 名前と年齢を表示
        myDog.showInfo();
    }
}