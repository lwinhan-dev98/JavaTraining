package Step5.lesson10;

public class lesson10 {
    public static void main(String[] args) {
        // Studentオブジェクトを作成
        Student student = new Student();

        // 名前と成績を設定
        student.setName("タロウ");
        student.setGrade(90);

        // 名前と成績を表示
        System.out.println("名前: " + student.getName());
        System.out.println("成績: " + student.getGrade());
    }
}