package oops.inheritance;

/**
 * Subclass (Child Class)
 * The 'extends' keyword makes Car a child of Vehicle.
 * It inherits all public and protected members from Vehicle.
 */
public class Car extends Vehicle {

    // This field is specific to the Car class
    private String modelName;

    // Constructor for the Car class
    public Car(String brand, int year, String modelName) {
        // 'super(brand, year)' calls the constructor of the parent class (Vehicle).
        // This MUST be the very first line in a child class constructor.
        // It initializes the fields inherited from the parent.
        super(brand, year);
        
        System.out.println("Car constructor is running...");
        this.modelName = modelName;
    }

    // This is method overriding. The Car class provides its own
    // version of a method that it inherited from the Vehicle class.
    @Override
    public void displayDetails() {
        // Call the parent's method first to display brand and year
        super.displayDetails(); 
        // Then, add the details specific to the Car
        System.out.println("Model: " + this.modelName);
    }

    // A method that only exists in the Car class
    public void start() {
        System.out.println("The " + this.brand + " " + this.modelName + " is starting.");
    }
}