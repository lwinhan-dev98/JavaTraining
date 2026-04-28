package Step8.lesson22;

public abstract class AuthenticationHandler {
    protected AuthenticationHandler next;

    public void setNext(AuthenticationHandler next) {
        this.next = next;
    }

    public void handle(LoginRequest request) {
        if (next != null) {
            next.handle(request);
        }
    }
}