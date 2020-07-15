package ru.job4j.condition;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class Max {

    public static int max(int left, int right) {
        return Math.max(left, right);
    }

    public static int max(int first, int second, int third) {
        return max(max(first, second), third);
    }

    public static int max(int first, int second, int third, int four) {
        return max(max(first, second, third), four);
    }
}