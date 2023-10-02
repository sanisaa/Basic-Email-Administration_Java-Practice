//Write a program that adds n numbers and prints the sum. The first input n should be the number of inputs to be taken for addition. Each subsequent input is a number to be added to the sum. Each input should be taken in a new line.


package practice;


import java.util.Scanner;
public class sum{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of inputs:");
		int n = scanner.nextInt();
		
		double total = 0;
		
		scanner.nextLine();
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter number"+i+1+":");
			double num = scanner.nextDouble();
			total+=num;
			
		}
		System.out.println("The sum of "+n+"numbers is:"+total);
		scanner.close();
		
	}
}