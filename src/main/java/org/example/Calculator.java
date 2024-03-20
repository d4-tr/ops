package org.example;

public class Calculator {

    /**
     * Adds two numbers together.
     *
     * @param a the first operand
     * @param b the second operand
     * @return the sum of {@code a} and {@code b}
     */
    public double add(final double a, final double b) {
        return a + b;
    }

    /**
     * Subtracts one number from another.
     *
     * @param a the minuend
     * @param b the subtrahend
     * @return the difference between {@code a} and {@code b}
     */
    public double subtract(final double a, final double b) {
        return a - b;
    }

    /**
     * Multiplies two numbers.
     *
     * @param a the first multiplicand
     * @param b the second multiplicand
     * @return the product of {@code a} and {@code b}
     */
    public double multiply(final double a, final double b) {
        return a * b;
    }

    /**
     * Divides one number by another.
     *
     * @param a the dividend
     * @param b the divisor
     * @return the quotient of {@code a} and {@code b}
     * @throws IllegalArgumentException if {@code b} is 0
     */
    public double divide(final double a, final double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divider cannot be 0.");
        }
        return a / b;
    }
}
