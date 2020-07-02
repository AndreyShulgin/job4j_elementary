package ru.job4j.array;

/**
 * Класс Defragment
 *
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class Defragment {

    /**
     * Метод переносит пустые ячейки массива в конец.
     *
     * @param array - массив
     * @return - отсортированный массив
     */
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                changeArray(array, index);
            }
        }
        return array;
    }

    private static void changeArray(String[] array, int index) {
        for (int in = index + 1; in < array.length; in++) {
            if (array[in] != null) {
                array[index] = array[in];
                array[in] = null;
                break;
            }
        }
    }
}
