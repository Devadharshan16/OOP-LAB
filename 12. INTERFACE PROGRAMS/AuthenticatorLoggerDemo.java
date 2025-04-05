interface Authenticator {
    boolean authenticate(String username, String password);
}

interface Logger {
    void logAccess(String username, boolean success);
}

class SecureLoginSystem implements Authenticator, Logger {
    String savedUser = "admin";
    String savedPass = "Admin123";

    public boolean authenticate(String username, String password) {
        return savedUser.equals(username) && savedPass.equals(password);
    }

    public void logAccess(String username, boolean success) {
        System.out.println("Login attempt by " + username + ": " + (success ? "SUCCESS" : "FAILURE"));
    }

    void login(String username, String password) {
        boolean result = authenticate(username, password);
        logAccess(username, result);
        if (result) {
            System.out.println("Access granted to " + username);
        } else {
            System.out.println("Access denied");
        }
    }
}

public class AuthenticatorLoggerDemo {
    public static void main(String[] args) {
        SecureLoginSystem system = new SecureLoginSystem();
        system.login("admin", "Admin123");
        system.login("user", "wrongpass");
    }
}