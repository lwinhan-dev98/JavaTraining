package Step5.lesson9;

public class lesson9 {
    public static void main(String[] args) {
        
        // Playable 型の変数に Game を入れる
        Playable game = new Game();
        game.play(); // ゲームをプレイする

        // Playable 型の変数に Music を入れる
        Playable music = new Music();
        music.play(); // 音楽を再生する
    }
}