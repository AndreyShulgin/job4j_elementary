package ru.job4j.array;

/**
 * Класс MinDiapason
 *
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class MinDiapason {
    /**
     * Метод ищет минимальное значение массива в заданном диапазоне
     *
     * @param array  - массив
     * @param start  - начало диапазона
     * @param finish - конец диапазона
     * @return - минимальное значение
     */
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start + 1; i <= finish; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;

    }
}
