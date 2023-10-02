//check is num is prime or not
package practice;

import java.util.Scanner;

public class PrimeChecker {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        if (number == 2) {
            return true; 
        }
      

        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                return false; // Divisible by (6k - 1) or (6k + 1), not prime
            }
        }

        return true; // If no divisors found, it's prime
    }

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of inputs:");
		int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        scanner.close();
    }
}
