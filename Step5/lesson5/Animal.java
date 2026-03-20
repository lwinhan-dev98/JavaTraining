package Step5.lesson5;

// 親クラス: Animal
public class Animal {

    // 名前（privateで外部から直接変更不可）
    private String name;

    // コンストラクタ
    public Animal(String name) {
        this.name = name;
    }

    // 名前を取得するメソッド
    public String getName() {
        return name;
    }

    // 声を出すメソッド
    public void makeSound() {
        System.out.println("動物の声");
    }
}