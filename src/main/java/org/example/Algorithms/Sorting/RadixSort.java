package org.example.Algorithms.Sorting;

import java.util.*;

public class RadixSort {

    public static int[] radixSort(int[] array) {
        int maxRadix = 0;
        for (int x = 0; x < array.length; x++) {
            int currentRadix = String.valueOf(Math.abs(array[x])).length();
            if (currentRadix > maxRadix) {
                maxRadix = currentRadix;
            }
        }
        HashMap<Integer, Queue<Integer>> numberCase = new HashMap<>();

        for (int x = 0; x < 10; x++) {
            numberCase.put(x, new LinkedList<>());
        }

        for (int x = 0; x < maxRadix; x++) {
            for (int y = 0; y < array.length; y++) {
                String number = String.valueOf(Math.abs(array[y]));
                if (number.length() - (x + 1) < 0) {
                    numberCase.get(0).add(array[y]);
                    continue;
                }
                int key = Character.getNumericValue(number.charAt(number.length() - (x + 1)));
                numberCase.get(key).add(array[y]);
            }
            array = fillingArray(numberCase);
            cleanHashMap(numberCase);
        }

        return array;
    }

    private static HashMap<Integer, Queue<Integer>> cleanHashMap(HashMap<Integer, Queue<Integer>> hashMap) {
        for (int x = 0; x < 10; x++) {
            hashMap.put(x, new LinkedList<>());
        }
        return hashMap;
    }

    private static int[] fillingArray(HashMap<Integer, Queue<Integer>> hashMap) {
        int sizeArray = 0;
        for (Integer key : hashMap.keySet()) {
            sizeArray += hashMap.get(key).size();
        }

        int[] array = new int[sizeArray];
        int count = 0;
        for (Integer key : hashMap.keySet()) {
            int sizeInputArray = hashMap.get(key).size();
            for (int y = 0; y < sizeInputArray; y++) {
                array[count++] = hashMap.get(key).remove();
            }
        }
        return array;
    }
}
