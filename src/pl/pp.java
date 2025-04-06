import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMain Menu:");
            System.out.println("1. Sum of Squares Calculator");
            System.out.println("2. Simple Calculator");
            System.out.println("3. Exit");
            System.out.print("Choose an option (1-3): ");

            int mainChoice;
            try {
                mainChoice = scanner.nextInt();
                if (mainChoice == 3) {
                    System.out.println("Goodbye!");
                    break;
                }
                if (mainChoice < 1 || mainChoice > 3) {
                    System.out.println("Invalid choice. Please try again.");
                    continue;
                }
            } catch (Exception e) {
                System.out.println("Please enter a number between 1 and 3.");
                scanner.nextLine(); // clear invalid input
                continue;
            }

            switch (mainChoice) {
                case 1:
                    sumOfSquaresCalculator(scanner);
                    break;
                case 2:
                    simpleCalculator(scanner);
                    break;
            }
        }

        scanner.close();
    }

    public static void sumOfSquaresCalculator(Scanner scanner) {
        while (true) {
            System.out.print("\nEnter lower and upper integer limits: ");
            int lower = scanner.nextInt();
            int upper = scanner.nextInt();

            if (upper <= lower) {
                System.out.println("Done");
                break;
            }

            int sum = 0;
            for (int i = lower; i <= upper; i++) {
                sum += i * i;
            }

            System.out.printf("The sums of the squares from %d to %d is %d\n",
                    lower * lower, upper * upper, sum);
        }
    }

    public static void simpleCalculator(Scanner scanner) {
        while (true) {
            System.out.println("\nCalculator Menu:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Back to Main Menu");
            System.out.print("Choose an option (1-5): ");

            int choice;
            try {
                choice = scanner.nextInt();
                if (choice == 5) {
                    break;
                }
                if (choice < 1 || choice > 5) {
                    System.out.println("Invalid choice. Please try again.");
                    continue;
                }
            } catch (Exception e) {
                System.out.println("Please enter a number between 1 and 5.");
                scanner.nextLine(); // clear invalid input
                continue;
            }

            System.out.print("Enter first number: ");
            double num1 = getValidNumber(scanner);
            System.out.print("Enter second number: ");
            double num2 = getValidNumber(scanner);

            switch (choice) {
                case 1:
                    System.out.printf("Result: %.2f + %.2f = %.2f\n", num1, num2, num1 + num2);
                    break;
                case 2:
                    System.out.printf("Result: %.2f - %.2f = %.2f\n", num1, num2, num1 - num2);
                    break;
                case 3:
                    System.out.printf("Result: %.2f × %.2f = %.2f\n", num1, num2, num1 * num2);
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Error: Cannot divide by zero!");
                    } else {
                        System.out.printf("Result: %.2f ÷ %.2f = %.2f\n", num1, num2, num1 / num2);
                    }
                    break;
            }
        }
    }

    public static double getValidNumber(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (Exception e) {
                System.out.print("Invalid number. Please try again: ");
                scanner.nextLine(); // clear invalid input
            }
        }
    }
}
