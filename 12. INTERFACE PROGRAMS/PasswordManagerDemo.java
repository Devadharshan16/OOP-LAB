interface Validator {
    boolean validate(String input);
}

interface Formatter {
    String format(String input);
}

class PasswordManager implements Validator, Formatter {
    public boolean validate(String input) {
        return input.length() >= 8 && input.matches(".*[A-Z].*") && input.matches(".*[0-9].*");
    }

    public String format(String input) {
        return input.replaceAll(" ", "").toLowerCase();
    }

    void processPassword(String password) {
        String formatted = format(password);
        if (validate(formatted)) {
            System.out.println("Password accepted: " + formatted);
        } else {
            System.out.println("Password does not meet criteria.");
        }
    }
}

public class PasswordManagerDemo {
    public static void main(String[] args) {
        PasswordManager pm = new PasswordManager();
        pm.processPassword("Pass word123");
        pm.processPassword("weak");
    }
}