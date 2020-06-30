package ru.job4j.array;

/**
 * Класс MatrixSum
 *
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class MatrixSum {

    /**
     * Метод возвращает сумму всех элементов массива
     *
     * @param array - массив
     * @return - сумма
     */
    public static int sum(int[][] array) {
        int rsl = 0;
        for (int[] ints : array) {
            for (int anInt : ints) {
                rsl += anInt;
            }
        }
        return rsl;
    }
}
