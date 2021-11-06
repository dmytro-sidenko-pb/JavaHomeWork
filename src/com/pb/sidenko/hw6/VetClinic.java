package com.pb.sidenko.hw6;

public class VetClinic {
    public static void main(String[] args) {
        Animal[] animal = new Animal[3];
        animal[0] = new Cat("Рыба", "дом", "Мурзик");
        animal[1] = new Dog("Мясо", "Двор", "Тузик");
        animal[2] = new Horse("Овес", "Конюшня", "Молния");
        Veterinarian veterinarian = new Veterinarian();
        for (int i = 0; i < animal.length; i++) {
            veterinarian.treatAnimal(animal[i]);
        }
    }
}

