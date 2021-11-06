package com.pb.sidenko.hw6;

import java.util.Objects;

public class Horse extends Animal {
    boolean isSteed;
    String maneColor;

    public Horse(String food, String location, String name) {
        super(food, location, name);
    }


    @Override
    public String toString() {
        return "Horse{" +
                "isSteed=" + isSteed +
                ", maneColor='" + maneColor + '\'' +
                '}';
    }

    @Override
    public void makeNoise() {
        System.out.println("Игого!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return isSteed == horse.isSteed && Objects.equals(maneColor, horse.maneColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSteed, maneColor);
    }

    @Override
    public void eat() {
        System.out.println(name + " ест овес в стойле");
    }
}
