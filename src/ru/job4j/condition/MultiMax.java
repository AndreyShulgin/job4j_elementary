package ru.job4j.condition;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class MultiMax {
    public int max(int first, int second, int third) {
        return first > second ? (first > third ? first : third) : (second > third ? second : third);
    }
}