// Base class Fruit
class Fruit {
    String name;
    String taste;
    String size;

    // Constructor
    Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    // Method to describe the fruit
    void eat() {
        System.out.println("Both " + name + " tastes " + taste + " and is of size " + size);
    }
}

// Subclass Apple
class Apple extends Fruit {
    // Constructor
    Apple() {
        super("Apple", "sweet", "medium");
    }

    // Overriding eat() method
    @Override
    void eat() {
        System.out.println("This is an Apple. It tastes sweet.");
    }
}

// Subclass Orange
class Orange extends Fruit {
    // Constructor
    Orange() {
        super("Orange", "sour", "small");
    }

    // Overriding eat() method
    @Override
    void eat() {
        System.out.println("This is an Orange. It tastes sour.");
    }
}

// Main class to test the implementation
public class Q24_Fruit {
   

    public static void main(String[] args) {
        Fruit apple = new Apple();
        Fruit orange = new Orange();
        
        Fruit fruit = new Fruit("Apple & Mango", "sweet", "medium");

        apple.eat();  // Outputs: This is an Apple. It tastes sweet.
        orange.eat(); // Outputs: This is an Orange. It tastes sour.
        fruit.eat();  // Outputs: The fruit tastes sweet and is of size medium
    }
}

