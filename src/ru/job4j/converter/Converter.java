package ru.job4j.converter;

/**
 * Класс Converter для конвертации рублей в евро и доллары.
 *
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class Converter {

    /**
     * Метод конвертирует рубли в евро.
     *
     * @param value - рубли.
     * @return - евро.
     */
    public static double rubleToEuro(int value) {
        return value / 70.0;
    }

    /**
     * Метод конверртирует рубли в доллары.
     *
     * @param value - рублки.
     * @return - доллары.
     */
    public static double rubleToDollar(int value) {
        return value / 60.0;
    }

    /**
     * Метод main.
     *
     * @param args - args.
     */
    public static void main(String[] args) {
        double euro = Converter.rubleToEuro(140);
        double dollar = Converter.rubleToDollar(150);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("150 rubles are " + dollar + " dollar.");
        int in = 140;
        double expected = 2;
        double out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        in = 150;
        expected = 2.5;
        out = rubleToDollar(in);
        passed = expected == out;
        System.out.println("150 rubles are 2.5. Test result : " + passed);
    }

}
