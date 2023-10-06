package org.example.Algorithms.Sorting;

public class MergeSort {

    // Метод для сортировки массива слиянием
    private static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            // Находим середину массива
            int middle = (left + right) / 2;

            // Рекурсивно сортируем две половины
            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);

            // Объединяем отсортированные половины
            merge(array, left, middle, right);
        }
    }

    // Метод для объединения двух подмассивов
    private static void merge(int[] array, int left, int middle, int right) {
        // Размеры временных подмассивов
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // Создаем временные подмассивы
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Копируем данные во временные подмассивы
        for (int i = 0; i < n1; ++i)
            leftArray[i] = array[left + i];
        for (int j = 0; j < n2; ++j)
            rightArray[j] = array[middle + 1 + j];

        // Индексы начальных элементов временных подмассивов
        int i = 0, j = 0;

        // Индекс начального элемента основного массива
        int k = left;
        while (i < n1 && j < n2) {
            // Сравниваем элементы временных подмассивов и записываем минимальный в основной массив
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Копируем оставшиеся элементы leftArray[], если они есть
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        // Копируем оставшиеся элементы rightArray[], если они есть
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Метод для вывода массива на экран
    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
