import java.util.*;
public class Q16_sum_avg {
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

        // Calculating the sum using a normal for loop
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }

        // Calculating the average
        double average = sum / (double) size;

        // Printing the results
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        // Closing the scanner
        sc.close();
    }
}


