package Step8.lesson10;

public class Client {

    public static void main(String[] args) {

        SmartHomeFacade smartHome = new SmartHomeFacade();

        smartHome.awayMode();
        smartHome.homeMode();
    }
}