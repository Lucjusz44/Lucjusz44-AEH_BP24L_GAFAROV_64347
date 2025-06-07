import java.io.*;
import java.util.Scanner;

public class myTwelfthApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File inputFile;

        // Ask for a valid input file
        while (true) {
            System.out.print("Enter input file path: ");
            String inputPath = scanner.nextLine();
            inputFile = new File(inputPath);

            if (inputFile.exists() && inputFile.isFile()) {
                break;
            } else {
                System.out.println("File does not exist. Please try again.");
            }
        }

        System.out.print("Enter output file path: ");
        String outputPath = scanner.nextLine();
        File outputFile = new File(outputPath);

        int lineCount = 0;

        // Count lines in the input file
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            while (reader.readLine() != null) {
                lineCount++;
            }
            System.out.println("Lines in input file: " + lineCount);
        } catch (IOException e) {
            System.out.println("Error reading input file: " + e.getMessage());
            return;
        }

        // Write result to the output file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            writer.write(inputFile.getName() + ": " + lineCount);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error writing to output file: " + e.getMessage());
        }
    }
}
