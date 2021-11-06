package com.pb.sidenko.hw6;

public class Animal {
    String food;
    String location;

    public Animal(String food, String location, String name) {
        this.food = food;
        this.location = location;
        this.name = name;
    }


    String name;

    public void makeNoise() {
    }

    public void eat() {
    }

    public void sleep() {
        System.out.println(name + " спит");
    }


}
