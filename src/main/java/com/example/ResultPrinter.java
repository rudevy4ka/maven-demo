package com.example;

public class ResultPrinter {
    public static void printResult(double a, double b, char operation, double result) {
        System.out.printf("Result: %.2f %c %.2f = %.2f\n", a, operation, b, result);
    }
}
