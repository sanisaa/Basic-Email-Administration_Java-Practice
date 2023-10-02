//check if the string is palindrome or not

package practice;

import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the string");
		int num = scanner.nextInt();
		int number = num;
		System.out.println("The number is"+num);
		int reverse=0, remainder;
		
		while(num!=0) {
			remainder = num % 10;
			reverse = reverse*10 + remainder;
			num = num/10;
		}
		System.out.println("The reverse of the number is"+reverse);
		System.out.println("Checking if the number is palindrome or not!!");
		if(number == reverse){
			System.out.println("The number "+number+" is palindrome");
			

		}else {
			System.out.println("The number "+number+" is not palindrome");
		}
		scanner.close();
	}

}
