package ru.job4j.array;

/**
 * Класс Matrix
 *
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class Matrix {

    /**
     * Таблица умножения в двухмерном массиве
     *
     * @param size - размер
     * @return - двухмерный масси
     */
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int out = 0; out < table.length; out++) {
            for (int in = 0; in < table[out].length; in++) {
                table[out][in] = (out + 1) * (in + 1);
            }
        }
        return table;
    }
}
