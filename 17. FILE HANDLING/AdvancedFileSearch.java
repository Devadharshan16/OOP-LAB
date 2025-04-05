import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class AdvancedFileSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter filename to search: ");
        String filename = scanner.nextLine();
        System.out.print("Enter keyword to search for: ");
        String keyword = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            int lineNum = 0;
            boolean found = false;

            while ((line = reader.readLine()) != null) {
                lineNum++;
                if (line.toLowerCase().contains(keyword.toLowerCase())) {
                    System.out.println("Line " + lineNum + ": " + line);
                    found = true;
                }
            }

            if (!found) {
                System.out.println("Keyword '" + keyword + "' not found in the file.");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}