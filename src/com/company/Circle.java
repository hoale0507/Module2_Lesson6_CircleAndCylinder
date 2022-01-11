package com.company;

public class Circle {
    private double radius;
    private String color;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Circle (){
    }
    public Circle(double r, String c){
        radius = r;
        color = c;
    }
    public double getArea(){
        return Math.pow(radius,2) * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' + ", area = "+getArea()+
                '}';
    }
}
