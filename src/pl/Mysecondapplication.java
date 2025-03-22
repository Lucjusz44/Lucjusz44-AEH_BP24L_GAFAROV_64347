import java.util.Scanner;

public class Mysecondapplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Run all cases sequentially
        runCase1(scanner);
        runCase2(scanner);
        runCase3();
        runCase4(scanner);

        scanner.close();
    }

    private static void runCase1(Scanner scanner) {
        System.out.println("\nRunning Case 1: Enter name and surname");
        System.out.println("Please enter your name:");
        String forename = scanner.nextLine();
        System.out.println("Please enter your surname:");
        String surname = scanner.nextLine();
        System.out.println("Welcome " + forename + " " + surname);
    }

    private static void runCase2(Scanner scanner) {
        System.out.println("\nRunning Case 2: Math operations");
        double x = 10, y = 2;
        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
        System.out.println("x % y = " + (x % y));

        System.out.println("Enter two numbers:");
        double first = scanner.nextDouble();
        double second = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.println("Sum = " + (first + second));
    }

    private static void runCase3() {
        System.out.println("\nRunning Case 3: Double & square of x");
        int num = 10;
        System.out.println("x = " + num);
        System.out.println("Double of x = " + (num * 2));
        System.out.println("x squared = " + (num * num));
    }

    private static void runCase4(Scanner scanner) {
        System.out.println("\nRunning Case 4: Age in seconds");
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        long ageInSeconds = (long) age * 365 * 24 * 60 * 60;
        System.out.println("My age in seconds: " + ageInSeconds);
    }
}