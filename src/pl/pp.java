public class myFifthApp {

    public static void sayHello() {
        System.out.println("Hello from a method!");
    }

    public static void showSum(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void printCharGrid(char ch, int cols, int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Task 1 (demo)
        sayHello();
        showSum(2, 3);
        System.out.println("Multiply: " + multiply(4, 5));

        // Task 2 (your method)
        printCharGrid('#', 5, 3);
    }
}
