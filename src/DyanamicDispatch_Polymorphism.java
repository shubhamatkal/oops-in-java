// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass: Dog
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Subclass: Cat
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class DyanamicDispatch_Polymorphism {
    public static void main(String[] args) {
        // Reference of Animal, but object is Dog
        Animal animal1 = new Dog();
        animal1.sound(); // Output: Dog barks

        // Reference of Animal, but object is Cat
        Animal animal2 = new Cat();
        animal2.sound(); // Output: Cat meows

        // Reference of Animal, object is Animal
        Animal animal3 = new Animal();
        animal3.sound(); // Output: Animal makes a sound
    }
}
