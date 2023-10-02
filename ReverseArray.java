//reverse array
package practice;

public class ReverseArray {

	public static void main(String[] args) {
		int []array = {1, 5, 6, 10, 2, 15, 8};
		int len = array.length;
		
		
		for(int i=0; i<len/2; i++) {
			int temp = array[i];
			array[i] = array[len-i-1];
			array[len-i-1] = temp;
		}
		
		System.out.println("The reverse array is ");
		for(int i = 0; i < len; i++) {
		    System.out.print(array[i] + " ");
		}
		System.out.println(); // Print a new line after the reversed array
	}

}
