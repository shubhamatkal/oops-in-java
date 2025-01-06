// Interface
interface Animal {
    void sound(); // Abstract method
    void eat();   // Abstract method
}

// Class implementing the interface
class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks.");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats bones.");
    }
}

public class Interface {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound(); // Output: Dog barks.
        dog.eat();   // Output: Dog eats bones.
    }
}
