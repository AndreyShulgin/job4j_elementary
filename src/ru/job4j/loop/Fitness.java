package ru.job4j.loop;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        while (ivan < nik) {
            month++;
            ivan = ivan * 3;
            nik = nik * 2;
        }
        return month;
    }
}