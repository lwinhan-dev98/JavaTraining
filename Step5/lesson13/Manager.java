package Step5.lesson13;

// マネージャークラス
public class Manager {

    // 給与を更新するメソッド
    public void updateSalary(Employee employee, double salary) {

        // Employeeのsetterを使う
        employee.setSalary(salary);
    }
}