import java.util.Scanner;

public class DivisionWithRetry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0;
        boolean success = false;

        while (!success) {
            try {
                System.out.print("Enter numerator: ");
                a = Integer.parseInt(sc.nextLine());

                System.out.print("Enter denominator: ");
                b = Integer.parseInt(sc.nextLine());

                int result = a / b;
                System.out.println("Result: " + result);
                success = true;

            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter integers.");
            } catch (ArithmeticException e) {
                System.out.println("Denominator cannot be zero.");
            }
        }

        sc.close();
    }
}