package practice;

import java.util.Scanner;

public class UpsideDownTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the upside-down triangle: ");
        int numRows = scanner.nextInt();

        for (int i = numRows; i >= 1; i--) {
            // Print spaces before each row
            for (int j = numRows - i; j > 0; j--) {
                System.out.print(" ");
            }

            // Print asterisks for the current row
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            // Move to the next line after printing each row
            System.out.println();
        }

        scanner.close();
    }
}
