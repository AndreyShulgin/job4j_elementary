package ru.job4j.array;

/**
 * Класс MatrixCheck
 *
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class MatrixCheck {

    /**
     * Метод проверяет что значения всеъ элементов во всех ячейках заданной строки 'X'
     *
     * @param board - массив
     * @param row   - строка
     * @return - true если все элементы 'X'
     */
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int index = 0; index < board[row].length; index++) {
            if (board[row][index] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
}
