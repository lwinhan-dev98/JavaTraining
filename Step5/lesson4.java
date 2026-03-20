package Step5;

// 人を表すクラス
class Person {

    // 年齢
    private int age;

    // コンストラクタ（年齢を引数で設定）
    public Person(int age) {
        if (age < 0) {
            System.out.println("年齢は0以上を指定してください。");
            this.age = 0; // エラーの場合は0歳に設定
        } else {
            this.age = age;
        }
    }

    // 年齢を表示するメソッド
    public void showAge() {
        System.out.println("この人の年齢は" + age + "歳です。");
    }
}

// lesson4のメインクラス
public class lesson4 {

    public static void main(String[] args) {
        // 年齢25歳のPersonオブジェクトを作成
        Person person = new Person(25);

        // 年齢を表示
        person.showAge();

        // 年齢0未満で作った場合の例
        Person invalidPerson = new Person(-5);
        invalidPerson.showAge();
    }
}