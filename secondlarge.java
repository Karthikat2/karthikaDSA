import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		  Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }

        // Find the largest element
        int largest = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
       System.out.println("Largest element: " + largest);

        // Find the second largest element without using Integer.MIN_VALUE
        int secondLargest = -1; // Initialize to a very small number
        boolean foundSecondLargest = false;

        for (int i = 0; i < n; i++) {
            if (array[i] < largest && array[i] > secondLargest) {
                secondLargest = array[i];
                foundSecondLargest = true;
            }
        }

        // Check if second largest exists
        if (!foundSecondLargest) {
            System.out.println("No second largest element");
        } else {
            System.out.println("Second largest element: " + secondLargest);
        }

	}
}
