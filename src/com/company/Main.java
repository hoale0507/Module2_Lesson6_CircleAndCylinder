package com.company;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(10, "red");
        System.out.println(circle);
        Cylinder cylinder = new Cylinder(20, "green", 10);
        System.out.println(cylinder);
    }
}
