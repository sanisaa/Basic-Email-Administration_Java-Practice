//Reverse the input string

package practice;
import java.util.Scanner;

public class StringReverse {
	public static void main (String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the string");
	String str = scanner.nextLine();
	String reverse = "";
	int length = str.length();
	
	for(int i=0; i<length; i++) {
		reverse = str.charAt(i) + reverse;
		
	}
	System.out.println(reverse);
	scanner.close();
}
}