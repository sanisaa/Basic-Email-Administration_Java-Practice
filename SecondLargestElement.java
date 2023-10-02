package practice;
public class SecondLargestElement {
    public static int findSecondLargest(int[] array) {
        int max = Integer.MIN_VALUE; // Initialize max as the smallest possible integer
        int secondMax = Integer.MIN_VALUE; // Initialize secondMax as the smallest possible integer

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                secondMax = max;
                max = array[i];
            } else if (array[i] > secondMax && array[i] != max) {
                secondMax = array[i];
            }
        }

        return secondMax;
    }

    public static void main(String[] args) {
        int[] array = {10, 5, 20, 15, 25, 30};

        int secondLargest = findSecondLargest(array);

        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("The second largest element is: " + secondLargest);
        } else {
            System.out.println("No second largest element found.");
        }
    }
}
