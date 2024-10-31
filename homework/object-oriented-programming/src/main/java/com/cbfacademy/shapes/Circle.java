package com.cbfacademy.shapes;

public class Circle implements Enclosure {
    double radius;

    @Override
    public double perimeter() {
      // 2nr
     double result = (2*Math.PI)*radius;
     return result;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

}
