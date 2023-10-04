package org.example.Algorithms.Sorting;

import java.util.Arrays;

public class InsertionSort {

    public int[] insertionSort(int[] array) {
        for (int x = 0; x < array.length - 1; x++) {
            if (array[x] > array[x + 1]) {
                for (int y = x; y >= 0; y--) {
                    int indexElement = y + 1;
                    int element = array[y + 1];
                    if (array[y] < element) break;
                    int temp = array[y];
                    array[y] = element;
                    array[indexElement] = temp;
                }
            }
        }
        return array;
    }
}
