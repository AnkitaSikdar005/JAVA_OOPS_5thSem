class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }

    public void sleep() {
        System.out.println("Animal is sleeping");
    }
}
class Bird extends Animal {
    @Override
    public void eat() {
        System.out.println("Bird is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Bird is sleeping");
    }

    public void fly() {
        System.out.println("Bird is flying");
    }
}
public class Q22_Animal {
    public static void main(String[] args) {
        // Creating an instance of Animal
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();

        // Creating an instance of Bird
        Bird bird = new Bird();
        bird.eat();
        bird.sleep();
        bird.fly();
    }
}
