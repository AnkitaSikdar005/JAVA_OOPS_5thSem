import java.util.*;

public class Q8_maleFemale2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking gender input
        System.out.print("Enter gender (Male/Female): ");
        String gender = sc.nextLine();

        // Taking age input
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        double interest = 0.0;

        // Determining the interest rate based on gender and age
        if (gender.equalsIgnoreCase("Female")) {
            if (age >= 1 && age <= 58) {
                interest = 8.2;
            } else if (age >= 59 && age <= 100) {
                interest = 9.2;
            }
        } else if (gender.equalsIgnoreCase("Male")) {
            if (age >= 1 && age <= 58) {
                interest = 8.4;
            } else if (age >= 59 && age <= 100) {
                interest = 10.5;
            }
        } else {
            System.out.println("Invalid gender. Please provide either 'Male' or 'Female'.");
          
        }

        // Checking if age is within a valid range
        if (age < 1 || age > 100) {
            System.out.println("Invalid age. Please provide an age between 1 and 100.");
        } else {
            System.out.println("The percentage of interest is: " + interest + "%");
        }


        sc.close();
    
    }
}
