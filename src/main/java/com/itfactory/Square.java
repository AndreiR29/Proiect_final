package com.itfactory;
public class Square implements Shape {
    private double side;

    public Square(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Latura patratului trebuie sa fie pozitiva.");
        }
        this.side = side;
    }
    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}
