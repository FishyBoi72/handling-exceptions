package org.example;

public class Calculator {
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is defined for non-negative integers only.");
        }

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int binomialCoefficient(int n, int k) {
        if (n < 0 || k < 0) {
            throw new IllegalArgumentException("Parameters must be non-negative.");
        }

        if (k > n) {
            throw new IllegalArgumentException("Subset size cannot exceed set size.");
        }

        return factorial(n) / (factorial(k) * factorial(n - k));
    }


    public static void main(String[] args) {
        try {
            System.out.println("Factorial of 5: " + factorial(5)); // 120

            System.out.println("Factorial of -1: " + factorial(-1));
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

        try {
            System.out.println("Binomial coefficient of (5, 2): " + binomialCoefficient(5, 2)); // 10

            System.out.println("Binomial coefficient of (5, -2): " + binomialCoefficient(5, -2));
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

        try {
            System.out.println("Binomial coefficient of (5, 6): " + binomialCoefficient(5, 6));
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
