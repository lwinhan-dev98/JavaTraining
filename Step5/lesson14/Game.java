package Step5.lesson14;

// Gameクラス
public class Game {

    // スコアをprivateで定義
    private int score;

    // コンストラクタ（初期-しょきスコア）
    public Game(int score) {
        this.score = score;
    }

    // スコアのgetter
    public int getScore() {
        return this.score;
    }

    // スコアのsetter
    public void setScore(int score) {

        // チェック（score < 0 の場合）
        if (score < 0) {
            System.out.println("エラー：スコアは0以上の値を設定してください。");
        } else {
            this.score = score;
        }
    }
}