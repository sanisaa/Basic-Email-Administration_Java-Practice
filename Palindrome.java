//check if the string is palindrome or not

package practice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the string");
		String str = scanner.nextLine();
		
		String reverse = "";
		int length = str.length();
		
		for(int i =0; i<length; i++) {
			reverse = str.charAt(i)+reverse;
		}
		System.out.println("Checking if the string is palindrome or not!!");
		if(str.equals(reverse)) {
			System.out.println("The string "+str+" is palindrome");
			

		}else {
			System.out.println("The string"+str+"is not palindrome");
		}
	}

}
