package Step8.lesson12;

public class PersonalNotification implements NotificationPlatform {

    @Override
    public void send(String message) {
        System.out.println("to a Personal Recipient: " + message);
    }
}