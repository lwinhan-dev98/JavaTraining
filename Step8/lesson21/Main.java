package Step8.lesson21;

public class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();

        // 4回信号を変更する（赤 → 青 → 黄 → 赤）
        for (int i = 0; i < 4; i++) {
            trafficLight.showState();
            System.out.println("Changing to next state...");
            trafficLight.changeState();
        }
    }
}

