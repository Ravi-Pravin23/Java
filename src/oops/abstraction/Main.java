package oops.abstraction;

public class Main {
    public static void main(String[] args) {

        // You cannot create an object of the abstract class itself.
        // The following line would cause an error:
        // Animal myAnimal = new Animal();

        // You can create an object of the concrete subclass (Dog).
        Dog myDog = new Dog();

        // Call the method that was implemented in the Dog class.
        myDog.makeSound();

        // Call the method that was inherited from the Animal class.
        myDog.sleep();
    }
}