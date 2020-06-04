package ru.job4j.condition;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class SqArea {
    public static double square(int p, int k) {
        int w = p / (2 * (k + 1));
        return w * w * k;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
    }
}