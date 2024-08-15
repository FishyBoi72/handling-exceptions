package org.example;

public class Person { // Declares a public class named Person.
    private String name; // Private instance variable to store the name of the person.
    private int age; // Private instance variable to store the age of the person.

    public Person(String name, int age) { // Constructor for the Person class, accepting a name and age as parameters.
        // Validates if the name is null, empty, or longer than 40 characters.
        if (name == null || name.isEmpty() || name.length() > 40) {
            // If the validation fails, an IllegalArgumentException is thrown with a specific error message.
            throw new IllegalArgumentException("Name must be non-null, non-empty, and no longer than 40 characters.");
        }

        // Validates if the age is outside the range of 0 to 120.
        if (age < 0 || age > 120) {
            // If the validation fails, an IllegalArgumentException is thrown with a specific error message.
            throw new IllegalArgumentException("Age must be between 0 and 120.");
        }

        // If both validations pass, the instance variables are initialized with the provided values.
        this.name = name;
        this.age = age;
    }

    public String getName() { // Public method to return the name of the person.
        return name; // Returns the value of the name variable.
    }

    public int getAge() { // Public method to return the age of the person.
        return age; // Returns the value of the age variable.
    }

    public static void main(String[] args) { // Main method, the entry point of the program.
        try {
            // Tries to create a new Person object with the name "Alice" and age 25.
            Person person1 = new Person("Alice", 25);
            // Prints out the name and age of the created person.
            System.out.println("Created person: " + person1.getName() + ", Age: " + person1.getAge());

            // Tries to create a new Person object with an empty name and age 25, which should throw an exception.
            Person person2 = new Person("", 25);
        } catch (IllegalArgumentException e) { // Catches the IllegalArgumentException thrown by the constructor.
            // Prints the error message to the standard error stream.
            System.err.println(e.getMessage());
        }

        try {
            // Tries to create a new Person object with the name "Bob" and an invalid age of 130, which should throw an exception.
            Person person3 = new Person("Bob", 130);
        } catch (IllegalArgumentException e) { // Catches the IllegalArgumentException thrown by the constructor.
            // Prints the error message to the standard error stream.
            System.err.println(e.getMessage());
        }
    }
}
