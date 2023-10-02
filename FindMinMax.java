package practice;

import java.util.Scanner;

public class FindMinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int largest = Integer.MIN_VALUE; // Initialize to the smallest possible integer
        int smallest = Integer.MAX_VALUE; // Initialize to the largest possible integer

        System.out.println("Enter a series of integers (-99 to end):");

        int number;
        while (true) {
            number = scanner.nextInt();

            if (number == -99) {
                break; // Exit the loop when -99 is entered
            }

            // Update the largest and smallest numbers
            if (number > largest) {
                largest = number;
            }
            if (number < smallest) {
                smallest = number;
            }
        }

        if (number == -99) {
            if (largest != Integer.MIN_VALUE && smallest != Integer.MAX_VALUE) {
                System.out.println("Largest number entered: " + largest);
                System.out.println("Smallest number entered: " + smallest);
            } else {
                System.out.println("No valid numbers entered.");
            }
        }

        scanner.close();
    }
}

