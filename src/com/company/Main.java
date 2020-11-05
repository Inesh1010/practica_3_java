package com.company;
import java.util.ArrayList;

class Shape {

    public Shape() {}

    @Override
    public String toString() {
        return "It's a shape";
    }

}

class Ball {

    public Ball() {}

}
class Book {

    public Book() {}

}
class Dog {

    private String name;
    private int age;

    public Dog() {}

    public Dog(String name) {
        this.name = name;
    }

    public Dog(int age) {
        this.age = age;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public int getHumanAge() {
        return this.age * 7;
    }

    @Override
    public String toString() {
        return "This a dog called " + this.name + " which is " + this.age + " years old (" + getHumanAge() + " in human years)";
    }

}
class DogFarm {

    private ArrayList<Dog> dogs = new ArrayList<Dog>();

    public DogFarm() {}

    public void addDog(Dog dog) {
        this.dogs.add(dog);
    }

}

public class Main {

    public static void main(String[] args) {

        Book book = new Book();
        Ball ball = new Ball();


        DogFarm farm = new DogFarm();
        Dog puppy = new Dog("snowball", 2);


        System.out.println(puppy);

        farm.addDog(puppy);

    }

}