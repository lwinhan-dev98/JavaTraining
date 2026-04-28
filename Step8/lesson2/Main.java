package Step8.lesson2;

public class Main {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        int result1 = calc.add(3, 5);
        int result2 = calc.add(1, 2, 3);
        double result3 = calc.add(2.5, 3.7);

        System.out.println("Result1: " + result1);
        System.out.println("Result2: " + result2);
        System.out.println("Result3: " + result3);
    }
}