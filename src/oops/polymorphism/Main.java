// File: Main.java
package oops.polymorphism;

public class Main {

    public static void main(String[] args) {

        // Here, we are using an Animal reference to hold a Dog object.
        // This is polymorphism.
        Animal myDog = new Dog(); 

        // And here, we are using an Animal reference to hold a Cat object.
        Animal myCat = new Cat();

        System.out.println("--- Demonstrating Polymorphism ---");

        // When animalSound() is called, Java determines at runtime
        // which version of the method to execute based on the actual object type.
        
        // This will call the animalSound() method from the Dog class.
        myDog.animalSound();

        // This will call the animalSound() method from the Cat class.
        myCat.animalSound();
    }
}