package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To3Then3() {
        int first = 1;
        int second = 2;
        int third = 3;
        int result = Max.max(first, second, third);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To4Then4() {
        int first = 1;
        int second = 2;
        int third = 3;
        int four = 4;
        int result = Max.max(first, second, third, four);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To1Then1() {
        int first = 1;
        int second = 1;
        int result = Max.max(first, second);
        int expected = 1;
        Assert.assertEquals(result, expected);
    }
}