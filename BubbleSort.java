//bubble sort

package practice;

public class BubbleSort {

	public static void main(String[] args) {
		int []array = {1, 5, 6, 10, 2, 15, 8};
		int len = array.length;
		for(int i=0; i<len; i++) {
			for(int j=0; j<len-i-1; j++) {
				if(array[j] > array[j+1]) {
					int t = array[j];
					array[j] = array[j+1];
					array[j+1]= t;
				}
			}
		}
		for(int i=0; i<len; i++) {
			System.out.println(array[i]);

		}
	}

}
