package org.example;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        if (name == null || name.isEmpty() || name.length() > 40) {
            throw new IllegalArgumentException("Name must be non-null, non-empty, and no longer than 40 characters.");
        }

        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Age must be between 0 and 120.");
        }

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        try {
            Person person1 = new Person("Alice", 25);
            System.out.println("Created person: " + person1.getName() + ", Age: " + person1.getAge());

            Person person2 = new Person("", 25);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

        try {
            Person person3 = new Person("Bob", 130);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
