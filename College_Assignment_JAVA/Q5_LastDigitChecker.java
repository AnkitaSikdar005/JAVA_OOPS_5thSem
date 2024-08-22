import java.util.*;

public class Q5_LastDigitChecker {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user for the first number
        System.out.print("Enter the first non-negative integer: ");
        int num1 = sc.nextInt();

        // Prompt the user for the second number
        System.out.print("Enter the second non-negative integer: ");
        int num2 = sc.nextInt();

        // Extract the last digits
        int lastDigit1 = num1 % 10;
        int lastDigit2 = num2 % 10;

        // Compare the last digits and print the result
        if (lastDigit1 == lastDigit2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        // Close the scanner
        sc.close();
    }
}


