import java.util.Scanner;

public class ArrayInputValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            while (true) {
                try {
                    System.out.print("Enter integer for position " + i + ": ");
                    arr[i] = Integer.parseInt(sc.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input! Please enter an integer.");
                }
            }
        }

        while (true) {
            try {
                System.out.print("Enter index to view element: ");
                int index = Integer.parseInt(sc.nextLine());
                System.out.println("Value at index " + index + ": " + arr[index]);
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Index out of bounds! Try again.");
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid index.");
            }
        }

        sc.close();
    }
}