package com.pb.sidenko.hw6;

import java.util.Objects;

public class Cat extends Animal {
    String claw;
    boolean isWool;

    public Cat(String food, String location, String name) {
        super(food, location, name);
    }


    @Override
    public String toString() {
        return "Cat{" +
                "claw='" + claw + '\'' +
                ", isWool=" + isWool +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return isWool == cat.isWool && Objects.equals(claw, cat.claw);
    }

    @Override
    public int hashCode() {
        return Objects.hash(claw, isWool);
    }

    @Override
    public void makeNoise() {
        System.out.println("Мяу!");
    }

    @Override
    public void eat() {
        System.out.println(name + "Ест рыбу и сметану из миски");
    }
}
