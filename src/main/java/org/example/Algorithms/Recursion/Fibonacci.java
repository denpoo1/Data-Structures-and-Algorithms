package org.example.Algorithms.Recursion;

import java.util.Arrays;

public class Fibonacci {
    // Given a number N return the index value of the Fibonacci sequence, where the sequence is:
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144 ...
// the pattern of the sequence is that each value is the sum of the 2 previous values, that means that for N=5 → 2+3
//For example: fibonacciRecursive(6) should return 8

    static int[] fibonacciIterative(int n) {
        int[] array = new int[n];
        for (int x = 0; x < n; x++) {
            if (x == 0 || x == 1) array[x] = x;
            else array[x] = array[x - 1] + array[x - 2];
        }
        return array;
    }

    static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(fibonacciRecursive(5));
    }
}
