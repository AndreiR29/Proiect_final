package com.itfactory;

import java.net.StandardSocketOptions;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Alegeți forma geometrică: ");
        System.out.println("1. Triunghi");
        System.out.println("2. Pătrat");
        System.out.println("3. Dreptunghi");
        System.out.print("Aleg optiunea: ");

            int option = sc.nextInt();
            double perimeter = 0;

                switch (option) {
                    case 1:
                        System.out.print("Introduceti lungimea laturii 1: ");
                        double side1 = sc.nextDouble();
                        System.out.print("Introduceti lungimea laturii 2: ");
                        double side2 = sc.nextDouble();
                        System.out.print("Introduceti lungimea laturii 3: ");
                        double side3 = sc.nextDouble();
                        Triangle triangle = new Triangle(side1, side2, side3);
                        perimeter = triangle.calculatePerimeter();
                        System.out.println("Perimetrul triunghiului este egal cu " + perimeter);
                        break;
                    case 2:
                        System.out.print("Introduceti lungimea laturii patratului: ");
                        double side = sc.nextDouble();
                        Square square = new Square(side);
                        perimeter = square.calculatePerimeter();
                        System.out.println("Perimetrul patratului este egal cu " + perimeter);
                        break;
                    case 3:
                        System.out.print("Introduceti lungimea dreptunghiului: ");
                        double length = sc.nextDouble();
                        System.out.print("Introduceti latimea dreptunghiului: ");
                        double width = sc.nextDouble();
                        Rectangle rectangle = new Rectangle(length, width);
                        perimeter = rectangle.calculatePerimeter();
                        System.out.println("Perimetrul dreptunghiului este egal cu " + perimeter);
                        break;
                    default:
                        throw new IllegalArgumentException("Opțiune invalidă. Vă rugăm să alegeți una dintre opțiunile 1, 2 sau 3.");
                }
    }
}



