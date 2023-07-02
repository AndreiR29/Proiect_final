package com.itfactory;

public class Triangle implements Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        if (side1 <= 0 || side2 <=0 || side3 <= 0 ) {
            throw new IllegalArgumentException("Laturile triunghiului trebuie sa fie pozitive.");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculatePerimeter(){
        return side1 + side2 + side3;
    }
}
