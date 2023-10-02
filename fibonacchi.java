//Fibonacci series

package practice;
import java.util.Scanner;

public class fibonacchi {

	public static void main(String[] args) {
		int a,b,c,i;
		a=0;
		b=1;
		System.out.println("Enter the number of terms:");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		System.out.println(a+" "+b);
		for(i=0; i<n; i++){
			c= a+b;
			a=b;
			b=c;
			System.out.println(" "+c);
		}
		scanner.close();

	}

}
