package org.example;

public class SimpleCalculator {
    public int add(int x, int y) {
        return x + y;
    }

    public int divide(int x, int y) {
        if (x == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return x / y;
    }

}
