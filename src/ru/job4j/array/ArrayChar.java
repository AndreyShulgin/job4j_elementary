package ru.job4j.array;

/**
 * Класс ArrayChar
 *
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i < pref.length; i++) {
            if (word[i] != pref[i]) {
                result = false;
                break;
            }

        }
        return result;
    }
}