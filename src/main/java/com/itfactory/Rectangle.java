package com.itfactory;

public class Rectangle implements Shape {
    private double length;
    private  double width;

    public Rectangle(double length, double width) {
        if (length <=0 || width <=0 ) {
            throw new IllegalArgumentException("Lungimea si latimea trebuie sa fie pozitive.");
        }
        this.length = length;
        this.width = width;
    }
    //@Override
    public double calculatePerimeter() {
        return 2 * length + 2 * width;
    }
}
