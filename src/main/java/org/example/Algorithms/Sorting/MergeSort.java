package org.example.Algorithms.Sorting;

import java.util.Arrays;

public class MergeSort {

    public static int[] merge(int[] array1, int[] array2) {
        int[] destArray = new int[array1.length + array2.length];
        int pointer1 = 0;
        int pointer2 = 0;
        int pointer3 = 0;
        while (pointer1 + pointer2 != destArray.length) {
            if (pointer1 != array1.length  && array1[pointer1] < array2[pointer2]) {
                destArray[pointer3++] = array1[pointer1++];
            } else {
                destArray[pointer3++] = array2[pointer2];
                if (pointer2 != array2.length - 1)  pointer2++;
            }
        }
        return destArray;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 11};
        int[] array2 = {5, 9, 9, 10};
        System.out.println(Arrays.toString(merge(array1, array2)));
    }
}
