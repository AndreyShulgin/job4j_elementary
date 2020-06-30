package ru.job4j.array;

/**
 * Класс SortSelected
 *
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class SortSelected {
    /**
     * Метод сортировки выборкой
     *
     * @param data - массив
     * @return - отсортированный массив
     */
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexOf(data, min, i, data.length);
            int tool = data[i];
            data[i] = data[index];
            data[index] = tool;
        }
        return data;
    }
}
