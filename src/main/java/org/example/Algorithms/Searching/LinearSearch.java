package org.example.Algorithms.Searching;

public class LinearSearch {
    public static int linearSearch(int number, int[] array) {
        for(int x = 0; x < array.length; x++) {
            if (array[x] == number) return x;
        }
        return -1;
    }
}
