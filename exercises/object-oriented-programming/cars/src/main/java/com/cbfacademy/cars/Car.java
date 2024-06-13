package com.cbfacademy.cars;
public class Car{

// public static void main(Str[] args){

// }

private String make;
private String model;
private String colour;
private int year;

public Car(String make, String model,  String colour, int year){
    this.make = make;
    this.model = model;
    this.colour = colour;
    this.year = year;
}

// int random[] = new int[10];
// random[10].add() = 12; //- set above , out of bound of variable limit

public String getMake(){
    return this.make;
}

public String getModel() {
    return this.model;
}

public int getYear() {
    return this.year;
}

public String getColor() {
    return this.colour;
}

public void setColour(String colour) {
this.colour = colour;
}

public String getDetails(){
    return "Car Details" + this.make + this.model + this.colour + this.year;

}
// Car volvoCar = new Car("Volvo", "V40", 2012, "blue");
// Car porscheCar = new Car("Porsche", "Panamera", 2009, "red");
// Car audiCar = new Car("Audi", "A3", 2018, "grey");

}