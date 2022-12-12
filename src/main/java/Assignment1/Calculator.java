package org.example;

public class Calculator {
    public static double calculateMultiply(double a, double b) {
        return a * b;
    }
    public static double calculateDivide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }
    public static double calculateSum(double a, double b) {
        return a + b;
    }
    public static double calculateSubtract(double a, double b) {
        return a - b;
    }
}
