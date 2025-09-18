 package oops.inheritance;

/**
 * Superclass (Parent Class)
 * This is the base class that defines common properties and methods for any vehicle.
 */
public class Vehicle {

    // 'protected' means this field can be accessed by this class and any subclass
    protected String brand;
    private int year;

    // Constructor for the Vehicle class
    public Vehicle(String brand, int year) {
        System.out.println("Vehicle constructor is running...");
        this.brand = brand;
        this.year = year;
    }

    // A method common to all vehicles
    public void honk() {
        System.out.println("Tuut, tuut!");
    }

    // Another method common to all vehicles
    public void displayDetails() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Year: " + this.year);
    }
}