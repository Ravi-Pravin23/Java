package oops.encapsulation;

public class Main {
    public static void main(String[] args) {
        // 1. Create an object (an instance) of the Student class
        Student studentOne = new Student();

        // 2. Use the public setter methods to assign values to the object's data
        studentOne.setName("Ravi");
        studentOne.setAge(21);

        // 3. Use the public getter methods to retrieve and print the data
        System.out.println("Student's Name: " + studentOne.getName());
        System.out.println("Student's Age: " + studentOne.getAge());
    }
}