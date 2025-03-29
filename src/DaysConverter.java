package pl.pp;

import java.util.Scanner;

public class DaysConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the number of days (0 or negative to exit):");
            int days = scanner.nextInt();
            if (days <= 0) {
                System.out.println("Exiting program...");
                break;
            }
            int weeks = days / 7;
            int remainingDays = days % 7;
            System.out.println(days + " days is " + weeks + " weeks and " + remainingDays + " days.");
        }
        scanner.close();
    }
}
