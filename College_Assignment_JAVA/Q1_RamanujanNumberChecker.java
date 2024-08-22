import java.util.*;

public class Q1_RamanujanNumberChecker {

    // Function to calculate the sum of the digits of a number
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    // Function to reverse the digits of a number
    public static int reverseNumber(int n) {
        int reversed = 0;
        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return reversed;
    }

    // Function to check if the number satisfies the digit sum reversal property
    public static boolean isRamanujanNumber(int n) {
        int digitSum = sumOfDigits(n);
        int reversedSum = reverseNumber(digitSum);

        return digitSum * reversedSum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (isRamanujanNumber(number)) {
            System.out.println(number + " is a Ramanujan number.");
        } else {
            System.out.println(number + " not a Ramanujan number.");
        }

        sc.close();
    }
}
