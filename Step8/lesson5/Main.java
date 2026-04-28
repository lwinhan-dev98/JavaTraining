package Step8.lesson5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("どの動物を生成しますか？（dog, cat, bird）：");
        String input = sc.nextLine();

        Animal animal = AnimalFactory.createAnimal(input);

        if (animal != null) {
            animal.makeSound();
        } else {
            System.out.println("そのような動物は存在しません。");
        }

        sc.close();
    }
}