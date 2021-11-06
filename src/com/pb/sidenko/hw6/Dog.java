package com.pb.sidenko.hw6;

import java.util.Objects;

public class Dog extends Animal {
    boolean isHunter;
    String salivation;

    public Dog(String food, String location, String name) {
        super(food, location, name);
    }


    @Override
    public void makeNoise() {
        System.out.println("Гав!");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "isHunter=" + isHunter +
                ", salivation='" + salivation + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return isHunter == dog.isHunter && Objects.equals(salivation, dog.salivation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isHunter, salivation);
    }

    @Override
    public void eat() {
        System.out.println(name + "Ест кашу и мясо из кастрюли");
    }
}
