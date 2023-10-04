package org.example.Algorithms.Sorting;

import java.util.Arrays;

public class SelectSort {

    public int[] selectSort(int[] array) {
        int min = 0;
        for (int x = 0; x < array.length; x++) {
            int index = x;
            min = array[x];
            for (int y = x + 1; y < array.length; y++) {
                if (min > array[y]) {
                    min = array[y];
                    index = y;
                }
            }
            int temp = array[x];
            array[x] = array[index];
            array[index] = temp;
        }
        return array;
    }
}
