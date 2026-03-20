package Step5.lesson5;

// 子クラス: Dog
public class Dog extends Animal {

    // コンストラクタ
    public Dog(String name) {
        super(name); // 親クラスのコンストラクタを呼び出す
    }

    // makeSoundをオーバーライド
    @Override
    public void makeSound() {
        System.out.println("ワンワン");
    }
}