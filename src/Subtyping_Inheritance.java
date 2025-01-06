// Parent class
class Employee {
    private String name;
    private double salary;

    // Constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Method to calculate bonus
    public double bonus() {
        return salary * 0.1; // 10% bonus
    }
}

// Subclass: Manager
class Manager extends Employee {
    private String department;

    // Constructor
    public Manager(String name, double salary, String department) {
        super(name, salary); // Call parent class constructor
        this.department = department;
    }

    // Getter for department
    public String getDepartment() {
        return department;
    }

    // Overriding bonus method
    @Override
    public double bonus() {
        return super.bonus() + 2000; // Additional fixed bonus for managers
    }
}

public class Subtyping_Inheritance {
    public static void main(String[] args) {
        // Subtyping Example
        Employee e = new Manager("Alice", 50000, "IT");
        System.out.println("Name: " + e.getName());  // Output: Alice
        System.out.println("Bonus: " + e.bonus());   // Calls Manager's bonus() method
        // Subtyping ensures we can use a Manager object wherever Employee is expected.

        // Inheritance Example
        Manager m = new Manager("Bob", 60000, "HR");
        System.out.println("Name: " + m.getName());          // Reuses Employee's method
        System.out.println("Department: " + m.getDepartment()); // Adds new functionality
        System.out.println("Bonus: " + m.bonus());           // Overridden method
        // Inheritance ensures code reuse and extension of functionality.
    }
}
