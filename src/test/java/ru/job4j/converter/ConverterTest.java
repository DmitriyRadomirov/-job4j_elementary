package ru.job4j.converter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

   @Test
    public void whenConvert140RblThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert200RblThen4Dlr() {
        float in = 240;
        float expected = 4;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }
}