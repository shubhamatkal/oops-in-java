class Rectangle {
    int length;
    int breadth;

    // Constructor with two arguments
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Constructor with one argument (square case)
    Rectangle(int side) {
        this(side, side); // Calls the constructor with two arguments
    }

    // Default constructor
    Rectangle() {
        this(1); // Calls the constructor with one argument
    }

    // Method to calculate area
    int calculateArea() {
        return length * breadth;
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        // Using the constructor with two arguments
        Rectangle rect1 = new Rectangle(10, 5);
        System.out.println("Area of rectangle: " + rect1.calculateArea()); // Output: 50

        // Using the constructor with one argument
        Rectangle square = new Rectangle(4);
        System.out.println("Area of square: " + square.calculateArea()); // Output: 16

        // Using the default constructor
        Rectangle defaultRect = new Rectangle();
        System.out.println("Area of default rectangle: " + defaultRect.calculateArea()); // Output: 1
    }
}
