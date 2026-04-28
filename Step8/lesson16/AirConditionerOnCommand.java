package Step8.lesson16;

public class AirConditionerOnCommand implements Command {
    private AirConditioner airConditioner;

    public AirConditionerOnCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnOn();
    }
}

