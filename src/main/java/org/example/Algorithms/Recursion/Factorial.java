package org.example.Algorithms.Recursion;

public class Factorial {
    // Write two functions that finds the factorial of any number. One should use recursive, the other should just use a for loop

    static long findFactorialRecursive(long number) {
        if (number == 0) {
            return 1;
        }
        return number * findFactorialRecursive(number - 1);
    }

    static long findFactorialIterative(long number) {
        long result = 1;
        for (int x = 0; x < number; x++) {
            result += result * x;
        }
        return result;
    }
}
