package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int rst = Factorial.calc(5);
        int expected = 120;
        assertThat(expected, is(rst));
        //напишите здесь тест, проверяющий, что факториал для числа 5 равен 120.
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int rst = Factorial.calc(0);
        int expected = 1;
        assertThat(expected, is(rst));
        //напишите здесь тест, проверяющий, что факториал для числа 0 равен 1.
    }
}