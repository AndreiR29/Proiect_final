package com.itfactory;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {
    @Test
    public void testTriangle() {
        Triangle triangle = new Triangle(3,4,6.5);
        double tringlePerimeter = triangle.calculatePerimeter();
        assertEquals(13.5, tringlePerimeter, 0.0001);
    }
}
