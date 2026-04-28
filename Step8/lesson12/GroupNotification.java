package Step8.lesson12;

public class GroupNotification implements NotificationPlatform {

    @Override
    public void send(String message) {
        System.out.println("to a Group: " + message);
    }
}