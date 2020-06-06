package ru.job4j.condition;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        boolean result = false;
        if (ab + ac > bc && ab + bc > ac && ac + bc > ab) {
            result = true;
        }
        return result;
    }
}