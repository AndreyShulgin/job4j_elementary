package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distance() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double result = Point.distance(x1, y1, x2, y2);
        double expected = 2.0;
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void distance3D() {
        Point point = new Point(1, 3, 3);
        Point anotherPoint = new Point(3, 7, 4);
        double result = point.distance3d(anotherPoint);
        double expected = 4.58;
        Assert.assertEquals(expected, result, 0.01);
    }
}