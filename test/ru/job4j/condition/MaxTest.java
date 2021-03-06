package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax2To1Then2() {
        int result = Max.max(2, 1);
        assertThat(result, is(2));
    }

    @Test
    public void whenNumbersEquals() {
        int result = Max.max(1, 1);
        assertThat(result, is(1));
    }

    @Test
    public void whenThreeNumbers() {
        int result = Max.max(1, 2, 3);
        assertThat(result, is(3));
    }

    @Test
    public void whenFourNumbers() {
        int result = Max.max(1, 5, 2, 3);
        assertThat(result, is(5));
    }
}