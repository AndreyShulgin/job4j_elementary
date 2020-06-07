package ru.job4j.loop;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class PrimeNumber {

    public int calc(int finish) {
        int count = 0;
        for (int number = 2; number <= finish; number++) {
            if (CheckPrimeNumber.check(number)) {
                count++;
            }
        }
        return count;
    }
}