package codingTest;
import java.util.Scanner;

public class PyramidPattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the number of rows
        System.out.print("Enter the number of rows for the pyramid: ");
        int rows = scanner.nextInt();

        int currentNumber = 1;

        for (int i = 1; i <= rows; i++) {
            // Print spaces for alignment
            for (int space = 1; space <= rows - i; space++) {
                System.out.print("  ");
            }

            // Print numbers in the pyramid with exactly one space between them
            for (int j = 1; j <= i; j++) {
                System.out.print(currentNumber);
                currentNumber++;
                // Add spaces between numbers, except the last one in the row
                if (j < i) {
                    System.out.print("  ");
                }
                // Adjust spaces for the last row
                if (i == rows && j == i - 1) {
                    System.out.print(" ");
                }
            }

            // Move to the next line for the next row
            System.out.println();
        }
    }
}
