public class Patterns {
    public static void main(String[] args) {
        int n = 5;

        // outer loop for rows
        for (int i = 1; i <= n; i++) {
            // inner loop for numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // move to next line after each row
            System.out.println();
        }
    }
}
