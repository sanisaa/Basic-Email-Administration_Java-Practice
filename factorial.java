package practice;

public class factorial {
	
	public static long factorial(int n) {
		if(n == 1) {
			return 1;
		}else {
			return(n*factorial(n-1));
		}
	}
	public static void main(String[] args) {
		
		int number = 4;
		System.out.println("factorial is "+factorial(number));
	}

}
