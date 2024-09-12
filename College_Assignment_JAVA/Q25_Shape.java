// Base class Shape
class Shape {
    // Methods to be overridden
    void draw() {
        System.out.println("Drawing Shape");
    }

    void erase() {
        System.out.println("Erasing Shape");
    }
}

// Subclass Circle
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    void erase() {
        System.out.println("Erasing Circle");
    }
}

// Subclass Triangle
class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Triangle");
    }

    @Override
    void erase() {
        System.out.println("Erasing Triangle");
    }
}

// Subclass Square
class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Square");
    }

    @Override
    void erase() {
        System.out.println("Erasing Square");
    }
}

// Main class to test polymorphism
public class Q25_Shape {
    public static void main(String[] args) {
        // Creating objects
        Shape c = new Circle();
        Shape t = new Triangle();
        Shape s = new Square();
        Shape s2= new Shape();

        // Calling methods to demonstrate polymorphism
        c.draw();
        c.erase();
        
        t.draw();
        t.erase();
        
        s.draw();
        s.erase();
        
        s2.draw();
        s2.erase();
    }
}
