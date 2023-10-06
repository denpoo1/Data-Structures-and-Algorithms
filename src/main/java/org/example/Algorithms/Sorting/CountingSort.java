package org.example.Algorithms.Sorting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

public class CountingSort {

    public static int[] countingSort(int[] array) {
        TreeMap<Integer, Integer> arrayCounter = new TreeMap<>();
        for (int x : array) {
            if (arrayCounter.containsKey(x)) arrayCounter.put(x, arrayCounter.get(x) + 1);
            else arrayCounter.put(x, 1);
        }
        int count = 0;
        for (int key : arrayCounter.keySet()) {
            int occurrences = arrayCounter.get(key);
            for (int y = 0; y < occurrences; y++) {
                array[count++] = key;
            }
        }
        return array;
    }
}
