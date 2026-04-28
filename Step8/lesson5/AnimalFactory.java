package Step8.lesson5;

public class AnimalFactory {

    public static Animal createAnimal(String type) {

        if (type.equalsIgnoreCase("dog")) {
            return new Dog();
        } else if (type.equalsIgnoreCase("cat")) {
            return new Cat();
        } else if (type.equalsIgnoreCase("bird")) {
            return new Bird();
        } else {
            return null;
        }
    }
}