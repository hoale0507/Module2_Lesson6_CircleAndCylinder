package com.company;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double r, String c, double height) {
        super(r, c);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height + ", volume="+getVolume()+ " is a subclass of a "+ super.toString()+
                '}';
    }
}
