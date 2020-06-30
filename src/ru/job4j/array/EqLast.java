package ru.job4j.array;

/**
 * Класс EqLast
 *
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class EqLast {
    /**
     * Метод сравнивает последние элементы в массивах
     *
     * @param left  - массив
     * @param right - массив
     * @return - true если последний элемент одинаковый
     */
    public static boolean check(int[] left, int[] right) {
        boolean result = false;
        if (left[left.length - 1] == right[right.length - 1]) {
            result = true;
        }
        return result;
    }
}
