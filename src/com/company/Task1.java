package com.company;

public class Task1 {
    public static void main(String[] args) {
        Animal[] animal = new Animal[3];
        animal[0] = new Cat("Корм", "Коробка");
        animal[1] = new Dog("Кость", "Будка");
        animal[2] = new Horse("Трава", "Стойла");
        Vet vet = new Vet();
        for (int i = 0; i < animal.length; i++) {
            vet.treatAnimal(animal[i]);
        }
    }
}
