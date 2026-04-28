package Step8.lesson12;

public class Main {

    public static void main(String[] args) {

        // Email + Personal
        Notification emailToPersonal =
                new EmailNotification(new PersonalNotification());

        emailToPersonal.notify("Hello, John!");

        // SMS + Group
        Notification smsToGroup =
                new SMSNotification(new GroupNotification());

        smsToGroup.notify("Meeting at 3 PM.");
    }
}