// Parent class: Animal
class Animal {
    String name;

    // Constructor to initialize name
    Animal(String name) {
        this.name = name;
    }

    // Method to describe the animal
    void describe() {
        System.out.println("This is an animal named " + name);
    }
}

// Subclass: Dog
class Dog extends Animal {
    String breed;

    // Constructor for Dog
    Dog(String name, String breed) {
        super(name); // Call the parent class constructor
        this.breed = breed;
    }

    // Overriding describe method
    @Override
    void describe() {
        System.out.println("This is a " + breed + " named " + name);
    }

    // Subclass-specific method
    void bark() {
        System.out.println(name + " says Woof!");
    }
}

public class SubClass_Inheritance {
    public static void main(String[] args) {
        // Create an object of the subclass
        Dog dog = new Dog("Buddy", "Golden Retriever");

        // Call inherited and overridden methods
        dog.describe(); // Output: This is a Golden Retriever named Buddy
        dog.bark();     // Output: Buddy says Woof!
    }
}
