package com.itfactory;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectagleTest {

    @Test
    public void testRectangle() {
        Rectangle rectangle = new Rectangle(4,2.5);
        double rectanglePerimeter = rectangle.calculatePerimeter();
        assertEquals(13, rectanglePerimeter, 0.0001);
    }
}
