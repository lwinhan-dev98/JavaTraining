package Step8.lesson22;

public class Main {
    public static void main(String[] args) {
        // チェーンの作成
        AuthenticationHandler usernameCheck = new UsernameCheckHandler();
        AuthenticationHandler passwordCheck = new PasswordLengthCheckHandler();
        AuthenticationHandler adminCheck = new AdminCheckHandler();

        // チェーンの接続
        usernameCheck.setNext(passwordCheck);
        usernameCheck.setNext(adminCheck);
        
        //ERROR usernameCheck.setNextHandler(passwordCheck);
        //ERROR passwordCheck.setNextHandler(adminCheck);

        // リクエストの作成（成功パターン）
        System.out.println("=== Test Case 1: Admin User ===");
        LoginRequest request1 = new LoginRequest("Alice", "securePass123", true);
        usernameCheck.handle(request1);

        // 短いパスワードのリクエスト（失敗）
        System.out.println("\n=== Test Case 2: Short Password ===");
        LoginRequest request2 = new LoginRequest("Bob", "123", false);
        usernameCheck.handle(request2);
    }
}

