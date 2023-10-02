//get matching elements in an integer array

package practice;

import java.util.Scanner;

public class MatchingElements {

	public static void main(String[] args) {
	
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the number of elements you want to store in the array");
		int number = s.nextInt();
		int array[] = new int[number];
		System.out.println("Enter the elements of the array");
		for(int i=0; i<number; i++) {
			array[i]= s.nextInt();
		}
		for (int m = 0; m<array.length; m++) {
			for (int n=m+1;n<array.length;n++) {
				if(array[m]==array[n]) {
					System.out.println("The matching elements are "+array[m]);
				}
			}
		}
		
		s.close();
		
	}

}
