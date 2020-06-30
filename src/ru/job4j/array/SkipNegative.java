package ru.job4j.array;

/**
 * Класс SkipNegative
 *
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class SkipNegative {
    /**
     * Метод меняет отризацательные значения в массиве на 0
     *
     * @param array - массив
     * @return - измененный массив
     */
    public static int[][] skip(int[][] array) {
        for (int out = 0; out < array.length; out++) {
            for (int in = 0; in < array[out].length; in++) {
                if (array[out][in] < 0) {
                    array[out][in] = 0;
                }
            }
        }
        return array;
    }
}
