//find number of occurrences of a character in a string
package practice;
import java.util.Scanner;
public class occurence {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the string");
		String str = s.nextLine();
		int length = str.length();
		
		System.out.println("Enter the character you want to search");
		char search = s.next().charAt(0);
		int count = 0;
		
		for(int i =0; i<length; i++) {
			if(str.charAt(i)==search) {
				count++;
			}
		}
		System.out.println("The charcter "+search+" occured "+count+" times");
		s.close();
	}
	
}
