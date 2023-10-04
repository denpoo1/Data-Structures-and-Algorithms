package org.example.Algorithms.Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {

    public int[] bubbleSort(int[] array) {
        int count = 0;
        int x = 0;
        while (count < array.length) {
            if (array[x] > array[x++]) {
                int temp = array[x];
                array[x] = array[x + 1];
                array[x + 1] = temp;
                count = 0;
            }
            count++;
        }
        return array;
    }
}
