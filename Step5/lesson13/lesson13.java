package Step5.lesson13;

public class lesson13 {
    public static void main(String[] args) {

        // Employee作成
        Employee employee = new Employee("タロウ", 300000); // 名前と初期給与を設定

        // マネージャークラスのオブジェクトを作成
        Manager manager = new Manager();

        // 現在の給与を表示
        System.out.println("現在の給与: " + employee.getSalary() + "円");

        // Managerだけが変更できる
        manager.updateSalary(employee, 350000);

        // 変更後の給与を表示
        System.out.println("変更後の給与: " + employee.getSalary() + "円");
    }
}