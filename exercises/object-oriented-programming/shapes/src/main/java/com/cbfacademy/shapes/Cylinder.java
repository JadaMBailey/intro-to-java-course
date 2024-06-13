package com.cbfacademy.shapes;

public class Cylinder extends Shape {
    protected double radius;
    protected double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
        this.name = "Cylinder";
    }
    
    @Override
    public double getArea(){
        return height * Math.PI * (radius*radius);
    }

}
