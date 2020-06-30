package ru.job4j.array;

/**
 * Класс EndWith
 *
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class EndWith {

    /**
     * Метод проверяет что массивы заканчиваются одинаково
     *
     * @param word - массив
     * @param post - массив
     * @return - true если совпадают
     */
    public static boolean endWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = 0; i < post.length - 1; i++) {
            if (word[word.length - 1 - i] != post[post.length - 1 - i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
