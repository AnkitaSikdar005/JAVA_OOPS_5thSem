public class Q8_maleFemale {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide gender and age as command line arguments.");
            return;
        }

        String gender = args[0];
        int age = Integer.parseInt(args[1]);
        double interestRate = 0.0;

        if (gender.equalsIgnoreCase("Female")) {
            if (age >= 1 && age <= 58) {
                interestRate = 8.2;
            } else if (age >= 59 && age <= 100) {
                interestRate = 9.2;
            }
        } else if (gender.equalsIgnoreCase("Male")) {
            if (age >= 1 && age <= 58) {
                interestRate = 8.4;
            } else if (age >= 59 && age <= 100) {
                interestRate = 10.5;
            }
        }

        System.out.println("The percentage of interest is: " + interestRate + "%");
    }
}

// Output:
// inorder to  get output after compiling  run the following commands in terminal:
// javac Q8_maleFemale.java
// java Q8_maleFemale  Female 58
