import java.util.*;

public class Q32_Handling_exceptions {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            // Input size of the array
            System.out.println("Enter the number of elements in the array:");
            int n = sc.nextInt();
            
            int[] array = new int[n];
            
            // Input elements of the array
            System.out.println("Enter the elements in the array:");
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }
            
            // Input the index to access
            System.out.println("Enter the index of the array element you want to access:");
            int index = sc.nextInt();
            
            // Access the array element
            System.out.println("The array element at index " + index + " = " + array[index]);
            System.out.println("The array element successfully accessed");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("java.lang.ArrayIndexOutOfBoundsException");
        } catch (Exception e) {
            System.out.println("java.lang.NumberFormatException");
        } finally {
            sc.close();
        }
    }
}

