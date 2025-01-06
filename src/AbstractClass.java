// Abstract class
abstract class Animal {
    // Abstract method (no implementation)
    abstract void sound();

    // Concrete method
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass: Dog
class Dog extends Animal {
    // Implementing the abstract method
    @Override
    void sound() {
        System.out.println("Dog barks.");
    }
}

// Subclass: Cat
class Cat extends Animal {
    // Implementing the abstract method
    @Override
    void sound() {
        System.out.println("Cat meows.");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        // Using abstract class through subclasses
        Animal dog = new Dog();
        dog.sound(); // Output: Dog barks.
        dog.eat();   // Output: This animal eats food.

        Animal cat = new Cat();
        cat.sound(); // Output: Cat meows.
        cat.eat();   // Output: This animal eats food.
    }
}
