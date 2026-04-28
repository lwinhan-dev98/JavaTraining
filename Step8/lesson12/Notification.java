package Step8.lesson12;

public abstract class Notification {

    protected NotificationPlatform platform;

    // constructor
    public Notification(NotificationPlatform platform) {
        this.platform = platform;
    }

    // abstract method
    public abstract void notify(String message);
}