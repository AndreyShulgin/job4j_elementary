package ru.job4j.converter;

import org.junit.Test;
import org.junit.Assert;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        int in = 140;
        double expected = 2;
        double out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out, 1);
    }

    @Test
    public void whenConvert150RblThen2And5Dollar() {
        int in = 150;
        double expected = 2.5;
        double out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out, 1);
    }
}