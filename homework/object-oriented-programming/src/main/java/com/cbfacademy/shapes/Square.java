package com.cbfacademy.shapes;

public class Square implements Enclosure {
    double width;

    public Square(double width) {
        this.width = width;
    }

    @Override
    public double perimeter() {
      double result = width*4;
      return result;
    }

    @Override
    public double area() {
        double result = width*width;
        return result;
    }

    

}
