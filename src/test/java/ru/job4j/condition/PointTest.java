package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class PointTest {

    @Test
    public void whenX0Y0toX0Y2then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        double expected = 2;
        assertThat(expected, is(a.distance(b)));
    }

    @Test
   public void whenX1Y1toX1Y1then0() {
        Point a = new Point(1, 1);
        Point b = new Point(1, 1);
        double dist = a.distance(b);
        double expected = 0;
        assertThat(expected, is(a.distance(b)));
    }

    @Test
    public void whenX2Y2toX1Y2then1() {
        Point a = new Point(2, 2);
        Point b = new Point(1, 2);
        double dist = a.distance(b);
        double expected = 1;
        assertThat(expected, is(a.distance(b)));
    }

    @Test
    public void whenX2Y2toX0Y2then2() {
        Point a = new Point(2, 2);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        double expected = 2;
        assertThat(expected, is(a.distance(b)));
    }
}
