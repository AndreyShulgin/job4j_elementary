package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void manWeight() {
        short height = 187;
        double result = Fit.manWeight(height);
        double expected = 100.05;
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void womanWeight() {
        short height = 175;
        double result = Fit.womanWeight(height);
        double expected = 74.75;
        Assert.assertEquals(expected, result, 0.01);
    }
}