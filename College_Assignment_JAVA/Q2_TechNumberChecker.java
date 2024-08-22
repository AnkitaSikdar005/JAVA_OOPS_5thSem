import java.util.*;

public class Q2_TechNumberChecker {

    // Function to check if the given number is a Tech number
    public static boolean isTechNumber(int number) {
        // Find the total number of digits in the number
        int numDigits = 0;
        int temp = number;
        while (temp > 0) {
            numDigits++;
            temp /= 10;
        }

        // Tech number must have an even number of digits
        if (numDigits % 2 != 0) {
            return false;
        }

        // Calculate the divisor to split the number into two equal halves
        int divisor = (int) Math.pow(10, numDigits / 2);

        int firstHalf = number / divisor;
        int secondHalf = number % divisor;

        int sum = firstHalf + secondHalf;
        int square = sum * sum;

        return square == number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (isTechNumber(number)) {
            System.out.println(number + " is a Tech number.");
        } else {
            System.out.println(number + " is not a Tech number.");
        }

        sc.close();
    }
}
