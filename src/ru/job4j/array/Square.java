package ru.job4j.array;

/**
 * Класс Square заполняет массив квадратами чисел
 *
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class Square {
    /**
     * Метод заполняет массив квадратами чисел до bound
     *
     * @param bound - число
     * @return - заполненный массив
     */
    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < rst.length; i++) {
            rst[i] = i * i;
        }
        return rst;
    }

    /**
     * Метод Main
     *
     * @param args - args
     */
    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int i : array) {
            System.out.println(i);
        }
    }
}