class Date {
    int day;
    int month;
    int year;

    // Constructor to initialize instance variables
    Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Default constructor (no arguments)
    Date() {
        this.day = 1; // Default value
        this.month = 1; // Default value
        this.year = 2000; // Default value
    }

    // Display method to print the date
    void displayDate() {
        System.out.println("Date: " + day + "/" + month + "/" + year);
    }
}

public class ObjectCreation {
    public static void main(String[] args) {
        // Creating an object with parameterized constructor
        Date date1 = new Date(13, 8, 2015);
        date1.displayDate(); // Output: Date: 13/8/2015

        // Creating an object with the default constructor
        Date date2 = new Date();
        date2.displayDate(); // Output: Date: 1/1/2000
    }
}
