package org.example.Algorithms.Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array2 = {0, 8, 9, 20, 7, 12};
        System.out.println(Arrays.toString(quickSort(array2)));
    }

    public static int[] quickSort(int[] array) {
        if (array.length == 0) return array;
        int element = array[0];
        int[] left = Arrays.stream(array).filter(x -> x < element).toArray();
        int[] right = Arrays.stream(array).filter(y -> y > element).toArray();

        return mergeArray(quickSort(left), element, quickSort(right));
    }

    public static int[] mergeArray(int[] arrayLeft, int center, int[] arrayRight) {
        int[] newArray = new int[arrayLeft.length + 1 + arrayRight.length];
        int currentIndex = 0;
        while (currentIndex < arrayLeft.length) {
            newArray[currentIndex] = arrayLeft[currentIndex++];
        }

        newArray[currentIndex++] = center;
        int rightIndex = 0;
        while (currentIndex < newArray.length) {
            newArray[currentIndex++] = arrayRight[rightIndex++];
        }

        return newArray;
    }
}
