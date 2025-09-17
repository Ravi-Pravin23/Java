package oops.abstraction;

/**
 * This is an abstract class that defines the basic template for an Animal.
 * It cannot be instantiated directly.
 * It contains one abstract method (makeSound) and one regular method (sleep).
 */
public abstract class Animal {

    /**
     * An abstract method.
     * It does not have a body {}.
     * Any class that inherits from Animal MUST provide its own implementation
     * for this method.
     */
    public abstract void makeSound();

    /**
     * A regular, non-abstract method.
     * This method has a body and can be used directly by any subclass.
     */
    public void sleep() {
        System.out.println("This animal is sleeping... zzz");
    }
}