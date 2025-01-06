class Student {
    String name;
    int age;

    // Constructor to initialize instance variables
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Student(Student other) {
        this.name = other.name; // Copying the name
        this.age = other.age;   // Copying the age
    }

    // Method to display student details
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class CopyConstructor_Shallow {
    public static void main(String[] args) {
        // Create an object using the parameterized constructor
        Student student1 = new Student("Alice", 20);

        // Create a new object by copying student1
        Student student2 = new Student(student1);

        // Display details of both objects
        System.out.println("Original Student:");
        student1.display(); // Output: Name: Alice, Age: 20

        System.out.println("Copied Student:");
        student2.display(); // Output: Name: Alice, Age: 20
    }
}
