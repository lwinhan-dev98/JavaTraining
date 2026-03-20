package Step5.lesson14;

public class lesson14 {
    public static void main(String[] args) {

        // Gameオブジェクト作成
        Game game = new Game(10);

        // 初期スコア表示
        System.out.println("初期スコア: " + game.getScore());

        // スコア更新
        game.setScore(25);
        System.out.println("更新後スコア: " + game.getScore());

        // マイナス（エラー）
        game.setScore(-5);

        // 再確認
        System.out.println("再度スコア: " + game.getScore());
    }
}