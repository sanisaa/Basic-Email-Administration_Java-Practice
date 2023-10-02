//check if the string are anagram or not
package practice;
import java.util.Arrays;
import java.util.Scanner;
public class anagram {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter first string");
		String str1 = s.nextLine();
		
		System.out.println("Enter second string");
		String str2 = s.nextLine();
		
		boolean anagramstat = false;
		int len1 = str1.length();
		int len2 = str2.length();
		
		if (len1!= len2) {
			System.out.println("The given strings are not anagram");
		}else {
			char [] anagram1 = str1.toCharArray();
			char [] anagram2 = str2.toCharArray();
			Arrays.sort(anagram1);
			Arrays.sort(anagram2);
			System.out.println(anagram1);
			System.out.println(anagram2);
			anagramstat = Arrays.equals(anagram1, anagram2);
			System.out.println(anagramstat);
		}
		if(anagramstat == true) {
			System.out.println("The given strings are anagram");
		}else {
			System.out.println("The given strings are not anagram");
		}
		
		s.close();
	}

}
