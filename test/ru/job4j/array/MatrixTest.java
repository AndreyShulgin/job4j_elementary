package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MatrixTest {

    @Test
    public void when3on3() {
        int[][] table = Matrix.multiple(3);
        int[][] expect = new int[][]{
                {1, 2, 3},
                {2, 4, 6},
                {3, 6, 9}
        };
        assertThat(table, is(expect));
    }
}