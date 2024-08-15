package org.example;

public class Calculator { // Defines a class named 'Calculator' that will contain methods for calculations

    public static int factorial(int n) { // Defines a static method 'factorial' that takes an integer 'n' as input and returns an integer
        if (n < 0) { // Checks if 'n' is less than 0
            throw new IllegalArgumentException("Factorial is defined for non-negative integers only."); // Throws an exception if 'n' is negative, since factorial is not defined for negative numbers
        }

        int result = 1; // Initializes an integer 'result' to 1, which will hold the factorial result
        for (int i = 1; i <= n; i++) { // A for loop that starts from 1 and runs until 'i' is equal to 'n'
            result *= i; // Multiplies 'result' by 'i' in each iteration to calculate the factorial
        }
        return result; // Returns the final value of 'result', which is the factorial of 'n'
    }

    public static int binomialCoefficient(int n, int k) { // Defines a static method 'binomialCoefficient' that takes two integers 'n' and 'k' as input and returns an integer
        if (n < 0 || k < 0) { // Checks if either 'n' or 'k' is less than 0
            throw new IllegalArgumentException("Parameters must be non-negative."); // Throws an exception if either 'n' or 'k' is negative, since binomial coefficients are not defined for negative numbers
        }

        if (k > n) { // Checks if 'k' is greater than 'n'
            throw new IllegalArgumentException("Subset size cannot exceed set size."); // Throws an exception if 'k' is greater than 'n', as this would be invalid for binomial coefficients
        }

        // Calculates the binomial coefficient using the formula: n! / (k! * (n-k)!)
        return factorial(n) / (factorial(k) * factorial(n - k)); // Returns the calculated binomial coefficient
    }

    public static void main(String[] args) { // The main method, the entry point of the program
        try { // Starts a try block to catch exceptions
            System.out.println("Factorial of 5: " + factorial(5)); // Calculates and prints the factorial of 5 (expected output: 120)

            System.out.println("Factorial of -1: " + factorial(-1)); // Tries to calculate the factorial of -1, which should throw an exception
        } catch (IllegalArgumentException e) { // Catches the IllegalArgumentException thrown by the factorial method
            System.err.println(e.getMessage()); // Prints the exception message to the standard error stream
        }

        try { // Starts another try block to catch exceptions
            System.out.println("Binomial coefficient of (5, 2): " + binomialCoefficient(5, 2)); // Calculates and prints the binomial coefficient of (5, 2) (expected output: 10)

            System.out.println("Binomial coefficient of (5, -2): " + binomialCoefficient(5, -2)); // Tries to calculate the binomial coefficient of (5, -2), which should throw an exception
        } catch (IllegalArgumentException e) { // Catches the IllegalArgumentException thrown by the binomialCoefficient method
            System.err.println(e.getMessage()); // Prints the exception message to the standard error stream
        }

        try { // Starts another try block to catch exceptions
            System.out.println("Binomial coefficient of (5, 6): " + binomialCoefficient(5, 6)); // Tries to calculate the binomial coefficient of (5, 6), which should throw an exception because 6 > 5
        } catch (IllegalArgumentException e) { // Catches the IllegalArgumentException thrown by the binomialCoefficient method
            System.err.println(e.getMessage()); // Prints the exception message to the standard error stream
        }
    }
}
