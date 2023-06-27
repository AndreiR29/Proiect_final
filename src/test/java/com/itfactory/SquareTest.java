package com.itfactory;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class SquareTest {
    @Test
    public void testSquare() {
        Square square = new Square(2.5);
        double squarePerimeter = square.calculatePerimeter();
        assertEquals(10, squarePerimeter, 0.0001);
    }
}
