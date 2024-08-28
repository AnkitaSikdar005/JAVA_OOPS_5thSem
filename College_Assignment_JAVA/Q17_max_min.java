
import java.util.*;
public class Q17_max_min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking the size of the array as input
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Taking array elements as input
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Initialize max and min with the first element of the array
        int max = arr[0];
        int min = arr[0];

        // Finding the maximum and minimum using a normal for loop
        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // Printing the results
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        // Closing the scanner
        sc.close();
    }
}
