package ru.job4j.array;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class SwitchArray {

    /**
     * Метод меняет местами 1 и последний элемент массива
     *
     * @param array - массив
     * @return - массив
     */
    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    /**
     * Метод меняет местами элементы массива с индексом source на dest
     *
     * @param array  - массив
     * @param source - индекс элемента массива
     * @param dest   - индекс элемента массива
     * @return - массив
     */
    public static int[] swap(int[] array, int source, int dest) {
        int temp = array[source];
        array[source] = array[dest];
        array[dest] = temp;
        return array;
    }

    /**
     * Метод main
     *
     * @param args - args
     */
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(nums);
        for (int i : rsl) {
            System.out.println(i);
        }
    }
}