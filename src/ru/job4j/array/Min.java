package ru.job4j.array;

/**
 * Класс Min
 *
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class Min {
    /**
     * Метод ищет минимальное значение в массиве
     *
     * @param array - массив
     * @return - минимальое значение
     */
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
