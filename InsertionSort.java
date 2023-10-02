//Insertion sort
package practice;

public class InsertionSort {

	public static void main(String[] args) {
		int []array = {1, 5, 6, 10, 2, 15, 8};
		int len = array.length;
		for(int i =1; i<len; i++) {
			int n = i;
			while(n>0 && array[n-1]>array[n]) {
				int t = array[n];
				array[n]= array[n-1];
				array[n-1] = t;
				n--;
			}
		}
		for(int i=0; i<len; i++) {
			System.out.println(array[i]);
	}

}}
