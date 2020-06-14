package ru.job4j.array;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class Check {
    /**
     * Метод проверяет заполнен ли массив только true или false
     *
     * @param data - массив
     * @return - возвращает true если элементы массива одинаковы
     */
    public static boolean mono(boolean[] data) {
        boolean result = true;
        if (data.length > 0) {
            boolean rst = data[0];
            for (int index = 1; index < data.length; index++) {
                if (rst != data[index]) {
                    result = false;
                    break;
                }
            }
        }

        return result;
    }
}