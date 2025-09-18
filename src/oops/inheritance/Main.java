package oops.inheritance;

public class Main {

    public static void main(String[] args) {

        System.out.println("--- Creating a Car Object ---");
        // Create an object of the child class
        Car myCar = new Car("Ford", 2024, "Mustang");

        System.out.println("\n--- Calling Methods on Car Object ---");
        
        // 1. Calling a method inherited from Vehicle
        // The 'honk()' method is not in Car.java, but it's inherited from Vehicle.java
        System.out.print("Calling inherited method: ");
        myCar.honk();

        // 2. Calling a method that is unique to Car
        myCar.start();

        // 3. Calling an overridden method
        // This will execute the 'displayDetails' method from the Car class,
        // which gives more specific information.
        System.out.println("\n--- Displaying Car Details (Overridden Method) ---");
        myCar.displayDetails();
    }
}