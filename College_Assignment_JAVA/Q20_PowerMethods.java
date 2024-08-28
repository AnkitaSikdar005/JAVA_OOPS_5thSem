import java.util.*;
public class Q20_PowerMethods {    
        // Method to calculate power for int inputs
        public static int powerInt(int num1, int num2) {
            return (int) Math.pow(num1, num2);
        }
    
        // Method to calculate power for double inputs
        public static double powerDouble(double num1, double num2) {
            return Math.pow(num1, num2);
        }
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Getting integer inputs from the user
            System.out.print("Enter the base integer: ");
            int intBase = scanner.nextInt();
            System.out.print("Enter the exponent integer: ");
            int intExponent = scanner.nextInt();
    
            // Getting double inputs from the user
            System.out.print("Enter the base double: ");
            double doubleBase = scanner.nextDouble();
            System.out.print("Enter the exponent double: ");
            double doubleExponent = scanner.nextDouble();
    
            // Calculating and displaying the results
            System.out.println("PowerInt: " + powerInt(intBase, intExponent)); // intBase^intExponent
            System.out.println("PowerDouble: " + powerDouble(doubleBase, doubleExponent)); // doubleBase^doubleExponent
    
            // Closing the scanner
            scanner.close();
        }
    }
    
    
    
