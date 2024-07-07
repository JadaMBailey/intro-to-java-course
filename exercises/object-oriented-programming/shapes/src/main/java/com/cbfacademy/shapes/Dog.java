package com.cbfacademy.shapes;

public class Dog
{
    

    private String breed;
    private String size;
    private int age;
    private String color;

    public Dog(String breed, String size, int age, String color)
    {
        this.breed = breed;
        this.size = size;
        this.age = age;
        this.color = color;
    }

    public void eat()
    {
        System.out.println("I eat and my size is "+ size);
    }

    public void sleep()
    {
        System.out.println("I'm a " + breed + " who sleeps");
    }

    public void sit()
    {
        System.out.println(color);
    }

    public void run()
    {
        System.out.println("I am this " + age + " and can still run fast");
    }


    public static void main(String[] args)
    {
        Dog newDog = new Dog("Bull XX", "Large", 12, "Brown");
        newDog.eat();
        newDog.sleep();
        newDog.sit();
        newDog.run();
    }


}