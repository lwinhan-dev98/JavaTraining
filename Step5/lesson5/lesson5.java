package Step5.lesson5;

public class lesson5 {

    public static void main(String[] args) {
        // Dogオブジェクト作成
        Animal dog = new Dog("ポチ");
        dog.makeSound(); // ワンワン と出力される

        // Catオブジェクト作成
        Animal cat = new Cat("ミケ");
        cat.makeSound(); // ニャーニャー と出力される

    }
}