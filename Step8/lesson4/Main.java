package Step8.lesson4;

public class Main {

    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        logger1.log("メッセージ1");
        logger1.log("メッセージ2");

        Logger logger2 = Logger.getInstance();
        logger2.log("メッセージ3");

        logger1.printLogs();

        // Check same instance
        if (logger1 == logger2) {
            System.out.println("同じインスタンスです。");
        } else {
            System.out.println("異なるインスタンスです。");
        }
    }
}