package oops.encapsulation;

public class Student {

    // 1. Private variables (Data is hidden from other classes)
    private String name;
    private int age;

    // 2. Public 'setter' methods to set the data
    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int newAge) {
        // We can add logic to protect our data
        if (newAge > 0) {
            this.age = newAge;
        }
    }

    // 3. Public 'getter' methods to get the data
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}