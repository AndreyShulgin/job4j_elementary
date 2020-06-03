package ru.job4j.calculator;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class ArgMethod {

    public static void hello(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        String name = "Andrey Shulgin";
        ArgMethod.hello(name);

    }
}