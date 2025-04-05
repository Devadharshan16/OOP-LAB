import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AdvancedFileStats {
    public static void main(String[] args) {
        String filename = "user_data.txt";
        int lineCount = 0;
        int adultCount = 0, minorCount = 0, seniorCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;

            while ((line = reader.readLine()) != null) {
                lineCount++;
                if (line.toLowerCase().contains("minor")) {
                    minorCount++;
                } else if (line.toLowerCase().contains("adult")) {
                    adultCount++;
                } else if (line.toLowerCase().contains("senior")) {
                    seniorCount++;
                }
            }

            System.out.println("Statistics from file: " + filename);
            System.out.println("Total lines: " + lineCount);
            System.out.println("Minors: " + minorCount);
            System.out.println("Adults: " + adultCount);
            System.out.println("Seniors: " + seniorCount);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}