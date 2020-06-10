package ru.job4j.array;

/**
 * Класс ArrayLoop заполняет массив через цикл for и выводит в консоль
 *
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class ArrayLoop {

    /**
     * Метод Main
     *
     * @param args - args
     */
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2 + 3;
        }

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
