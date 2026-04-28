package Step8.lesson15;

public class DoorProxy implements Door {
    private RealDoor realDoor;
    private String password;

    public DoorProxy(String password) {
        this.realDoor = new RealDoor();
        this.password = password;
    }

    public void open(String inputPassword) {
        if (inputPassword.equals(password)) {
            realDoor.open(inputPassword);;
        } else {
            System.out.println("Access Denied! Incorrect password.");
        }
    }
}

