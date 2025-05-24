public class myTenthApp {

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, -3, -2, -1};
        int[] result = countAndSumElements(input);

        if (result.length == 0) {
            System.out.println("Empty input");
        } else {
            System.out.println("Negative count: " + result[0]);
            System.out.println("Positive sum: " + result[1]);
        }
    }

    public static int[] countAndSumElements(int[] input) {
        if (input == null || input.length == 0) return new int[0];

        int negatives = 0, positives = 0;
        for (int n : input) {
            if (n < 0) negatives++;
            else if (n > 0) positives += n;
        }
        return new int[] {negatives, positives};
    }
}
