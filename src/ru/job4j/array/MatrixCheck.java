package ru.job4j.array;

/**
 * Класс MatrixCheck
 *
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class MatrixCheck {

    /**
     * Метод проверяет что значения всех элементов во всех ячейках заданного столбца 'X'
     *
     * @param board - массив
     * @param row   - столбец
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

    /**
     * Метод проверяет что значения всех элементов во всех столбцах строки column равно 'X'
     *
     * @param board  - массив
     * @param column - строка
     * @return - true если все элементы 'X'
     */
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (char[] chars : board) {
            if (chars[column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * Метод заполняет массив значениями диагонали двухмерного массива board
     *
     * @param board - двухмерный массив
     * @return - массив
     */
    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int index = 0; index < board.length; index++) {
            rsl[index] = board[index][index];
        }
        return rsl;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int index = 0; index < board.length; index++) {
            if ((board[3][index] == 'X'
                    || board[index][3] == 'X')
                    && (monoHorizontal(board, index)
                    || monoVertical(board, index))) {
                result = true;
                break;
            }
        }
        return result;
    }
}
