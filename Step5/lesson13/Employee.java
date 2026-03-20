package Step5.lesson13;

// 社員クラス
public class Employee {

    private String name;
    private double salary;

    // コンストラクタ
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // 給与のgetter
    public double getSalary() {
        return this.salary;
    }

    // 給与のsetter
    // Managerクラスだけが使う
    protected void setSalary(double salary) {

        // チェック
        if (salary <= 0) {
            System.out.println("給与は0以上の値を設定してください");
        } else {
            this.salary = salary;
        }
    }
}