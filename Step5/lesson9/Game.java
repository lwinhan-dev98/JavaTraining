package Step5.lesson9;

// Playable を実装した Game クラス
public class Game implements Playable {
    
    @Override
    public void play() {
        // ゲームをする動作
        System.out.println("ゲームをプレイしています");
    }
}