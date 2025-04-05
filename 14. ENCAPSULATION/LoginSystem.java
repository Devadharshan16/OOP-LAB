
class User {
    private String username;
    private String password;

    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public boolean authenticate(String uname, String pass) {
        return this.username.equals(uname) && this.password.equals(pass);
    }
}

public class LoginSystem {
    public static void main(String[] args) {
        User user = new User();
        user.setUsername("admin");
        user.setPassword("1234");

        System.out.println("Login Successful? " + user.authenticate("admin", "1234"));
    }
}
