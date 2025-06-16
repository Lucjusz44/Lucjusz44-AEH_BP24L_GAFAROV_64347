import java.io.*;
import java.nio.file.*;
import java.util.*;

public class myThirteenthApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputPath = "";
        String outputPath = "";

        // Ask for valid input file
        while (true) {
            System.out.print("Enter input file path: ");
            inputPath = scanner.nextLine();
            if (Files.exists(Paths.get(inputPath))) {
                break;
            } else {
                System.out.println("File not found. Try again.");
            }
        }

        // Ask for output file path
        System.out.print("Enter output file path: ");
        outputPath = scanner.nextLine();

        Map<String, Integer> wordCounts = new HashMap<>();
        int totalWords = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.toLowerCase().split("\\W+"); // split by non-word chars
                for (String word : words) {
                    if (!word.isEmpty()) {
                        totalWords++;
                        wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading input file.");
            return;
        }

        // Console output
        System.out.println("Total words: " + totalWords);
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Write to output file
        try (PrintWriter writer = new PrintWriter(new FileWriter(outputPath))) {
            writer.println("File: " + inputPath);
            writer.println("Total words: " + totalWords);
            for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
                writer.println(entry.getKey() + ": " + entry.getValue());
            }
            System.out.println("Results saved to: " + outputPath);
        } catch (IOException e) {
            System.out.println("Error writing to output file.");
        }
    }
}

