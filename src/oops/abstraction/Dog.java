package oops.abstraction;

/**
 * The Dog class is a subclass of Animal.
 * Because it inherits from an abstract class, it is required to
 * provide a concrete implementation for the abstract `makeSound()` method.
 */
public class Dog extends Animal {

    /**
     * This is the required implementation of the makeSound() method.
     * The @Override annotation is good practice to show we are implementing
     * a method from a parent class.
     */
    @Override
    public void makeSound() {
        System.out.println("The dog says: woof woof");
    }
}