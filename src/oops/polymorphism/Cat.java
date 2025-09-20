// File: Cat.java
package oops.polymorphism;

/**
 * This is another subclass that inherits from Animal.
 * It also overrides the animalSound() method with its own implementation.
 */
public class Cat extends Animal {

    @Override
    public void animalSound() {
        System.out.println("The cat says: meow meow");
    }
}