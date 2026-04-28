package Step8.lesson1;

public class Dog extends Animal {

    public void bark() {
        System.out.println("ワンワン！");
    }

    @Override
    public void eat() {
        System.out.println("犬がドッグフードを食べます。");
    }
}