package mypackage.main;

import mypackage.utility.Utility;

public class MainApp {
    public static void main(String[] args) {
        Utility utility = new Utility();
        String message = utility.greet("User");
        System.out.println(message);
    }
}