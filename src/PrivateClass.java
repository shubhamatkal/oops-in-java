class Outer {
    // Private inner class
    private class Inner {
        void display() {
            System.out.println("This is a private inner class.");
        }
    }

    // Method to access the private inner class
    void useInner() {
        Inner inner = new Inner();
        inner.display();
    }
}

public class PrivateClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.useInner(); // Output: This is a private inner class.
    }
}
