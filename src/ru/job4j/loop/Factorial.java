package ru.job4j.loop;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class Factorial {
    public static int calc(int n) {
        int result = 1;
        if (n != 0) {
            for (int x = 1; x <= n; x++) {
                result = result * x;
            }
        }
        return result;
    }
}