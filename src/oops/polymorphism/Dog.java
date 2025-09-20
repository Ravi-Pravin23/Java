// File: Dog.java
package oops.polymorphism;

/**
 * This is a subclass that inherits from Animal.
 * It overrides the animalSound() method.
 */
public class Dog extends Animal {
    
    @Override
    public void animalSound() {
        System.out.println("The dog says: woof woof");
    }
}