package Step5.lesson10;

// 学生クラス
public class Student {
    // 名前と成績をprivateで定義
    private String name;
    private int grade;

    // 名前のsetter
    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("名前を入力してください");
        } else {
            this.name = name;
        }
    }

    // 名前のgetter
    public String getName() {
        return this.name;
    }

    // 成績のsetter
    public void setGrade(int grade) {
        if (grade < 0 || grade > 100) {
            System.out.println("成績は0から100の間で入力してください");
        } else {
            this.grade = grade;
        }
    }

    // 成績のgetter
    public int getGrade() {
        return this.grade;
    }
}