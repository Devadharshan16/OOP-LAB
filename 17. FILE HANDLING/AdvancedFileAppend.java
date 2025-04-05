import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AdvancedFileAppend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filename = "user_data.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            System.out.print("How many entries would you like to append? ");
            int count = scanner.nextInt();
            scanner.nextLine(); 

            for (int i = 1; i <= count; i++) {
                System.out.println("Appending Entry #" + i);
                System.out.print("Enter product name: ");
                String product = scanner.nextLine();
                System.out.print("Enter price: ");
                double price = scanner.nextDouble();
                scanner.nextLine(); 

                String category;
                if (price < 50) {
                    category = "Budget";
                } else if (price <= 200) {
                    category = "Standard";
                } else {
                    category = "Premium";
                }

                writer.write("Product: " + product + ", Price: " + price + ", Category: " + category);
                writer.newLine();
            }

            System.out.println("Entries appended to " + filename);
        } catch (IOException e) {
            System.out.println("Error appending to file: " + e.getMessage());
        }
        scanner.close();
    }
}