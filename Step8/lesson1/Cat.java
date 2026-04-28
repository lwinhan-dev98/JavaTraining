package Step8.lesson1;

public class Cat extends Animal {

    public void meow() {
        System.out.println("ニャーニャー！");
    }

    @Override
    public void eat() {
        System.out.println("猫がキャットフードを食べます。");
    }
}