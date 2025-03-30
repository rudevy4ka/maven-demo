package com.example;

public class Calculator {
    public static double calculate(double a, double b, char operation) {
        switch (operation) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return (b != 0) ? a / b : Double.NaN;
            default: throw new IllegalArgumentException("Invalid operation");
        }
    }
}
