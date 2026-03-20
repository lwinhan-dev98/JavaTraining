package Step5.lesson5;

// 子クラス: Cat
public class Cat extends Animal {

    // コンストラクタ
    public Cat(String name) {
        super(name); // 親クラスのコンストラクタを呼び出す
    }

    // makeSoundをオーバーライド
    @Override
    public void makeSound() {
        System.out.println("ニャーニャー");
    }
}