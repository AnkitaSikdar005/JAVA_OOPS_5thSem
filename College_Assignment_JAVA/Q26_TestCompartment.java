abstract class Compartment {
    public abstract String notice();
}

// FirstClass compartment class
class FirstClass extends Compartment {
    @Override
    public String notice() {
        return "This is a First Class compartment.";
    }
}

// Ladies compartment class
class Ladies extends Compartment {
    @Override
    public String notice() {
        return "This is a Ladies compartment.";
    }
}

// General compartment class
class General extends Compartment {
    @Override
    public String notice() {
        return "This is a General compartment.";
    }
}

// Luggage compartment class
class Luggage extends Compartment {
    @Override
    public String notice() {
        return "This is a Luggage compartment.";
    }
}

// Test class
public class Q26_TestCompartment {
    public static void main(String[] args) {
        // Array of size 10 for compartments
        Compartment[] compartments = new Compartment[10];

        // Randomly generate compartment types
        for (int i = 0; i < compartments.length; i++) {
            int randomNum = (int) (Math.random() * 4) + 1; // Generates a number between 1 and 4

            switch (randomNum) {
                case 1:
                    compartments[i] = new Luggage();
                    break;
                case 2:
                    compartments[i] = new Ladies();
                    break;
                case 3:
                    compartments[i] = new General();
                    break;
                case 4:
                    compartments[i] = new FirstClass();
                    break;
            }
        }

        // Display the notice for each compartment
        for (int i = 0; i < compartments.length; i++) {
            System.out.println("Compartment " + (i + 1) + ": " + compartments[i].notice());
        }
    }
}
