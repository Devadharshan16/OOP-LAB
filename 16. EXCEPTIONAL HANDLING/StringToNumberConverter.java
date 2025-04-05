import java.util.Scanner;

public class StringToNumberConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueInput = true;

        while (continueInput) {
            try {
                System.out.print("Enter a number string (e.g. '123'): ");
                String input = sc.nextLine();
                int number = Integer.parseInt(input);
                System.out.println("You entered number: " + number);
                continueInput = false;
            } catch (NumberFormatException e) {
                System.out.println("Invalid format! Please enter numeric digits only.");
            }
        }

        sc.close();
    }
}