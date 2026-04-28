package Step8.lesson10;

public class SmartHomeFacade {

    private LightSystem lightSystem;
    private AirConditionerSystem airConditionerSystem;
    private DoorLockSystem doorLockSystem;

    public SmartHomeFacade() {
        lightSystem = new LightSystem();
        airConditionerSystem = new AirConditionerSystem();
        doorLockSystem = new DoorLockSystem();
    }

    // お出かけモード
    public void awayMode() {
        System.out.println("お出かけモードを開始します...");
        lightSystem.turnOff();
        airConditionerSystem.turnOff();
        doorLockSystem.lock();
        System.out.println("お出かけモードが完了しました。\n");
    }

    // 帰宅モード
    public void homeMode() {
        System.out.println("帰宅モードを開始します...");
        doorLockSystem.unlock();
        lightSystem.turnOn();
        airConditionerSystem.turnOn();
        System.out.println("帰宅モードが完了しました。\n");
    }
}