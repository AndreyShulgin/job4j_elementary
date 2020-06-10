package ru.job4j.array;

/**
 * Класс для поиска элемента в массиве
 *
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class FindLoop {

    /**
     * Метод возвращает индекс заданного элемента
     *
     * @param data - массив
     * @param el   - искомое значение
     * @return - возвращает индекс в массиве или -1 если el не найден.
     */
    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}