package org.example.Algorithms.Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(binarySearch(8, array));
    }

    public static int binarySearch(int number, int[] array) {
        int currentIndex = (array.length - 1) / 2;

        if (array.length == 1) {
            return (array[0] == number) ? currentIndex : -1;
        } else if (number > array[currentIndex]) {
            return binarySearch(number, array, currentIndex + 1, array.length);
        } else {
            return binarySearch(number, array, 0, currentIndex);
        }
    }

    private static int binarySearch(int number, int[] array, int start, int end) {
        int currentIndex = (start + end) / 2;

        if (start == end) {
            return (array[currentIndex] == number) ? currentIndex : -1;
        } else if (number > array[currentIndex]) {
            return binarySearch(number, array, currentIndex + 1, end);
        } else {
            return binarySearch(number, array, start, currentIndex);
        }
    }


}
