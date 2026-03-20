package Step5.lesson7;

public class lesson7 {
    public static void main(String[] args) {
        Employee manager = new Manager();
        manager.showTitle(); // 役職: マネージャー

        Employee engineer = new Engineer();
        engineer.showTitle(); // 役職: エンジニア
    }
}