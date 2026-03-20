package Step5.lesson9;

// Playable を実装した Music クラス
public class Music implements Playable {
    
    @Override
    public void play() {
        // 音楽を再生する動作
        System.out.println("音楽を再生しています");
    }
}