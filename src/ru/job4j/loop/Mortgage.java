package ru.job4j.loop;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 1;
        double newAmount = amount + amount * percent / 100;
        while (salary < newAmount) {
            newAmount = newAmount - salary;
            newAmount = newAmount + newAmount * percent / 100;
            year++;
        }
        return year;
    }
}