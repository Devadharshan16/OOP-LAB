import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class AdvancedFileReader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the filename to read: ");
        String filename = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            int lineCount = 0;
            System.out.println("Contents of " + filename + ":");
            while ((line = reader.readLine()) != null) {
                lineCount++;
                System.out.println("Line " + lineCount + ": " + line);
                if (line.toLowerCase().contains("senior")) {
                    System.out.println("\t-> This person is a senior.");
                }
            }
            if (lineCount == 0) {
                System.out.println("The file is empty.");
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        scanner.close();
    }
}