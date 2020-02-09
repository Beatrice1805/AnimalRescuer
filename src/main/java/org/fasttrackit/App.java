package org.fasttrackit;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Animal Rescuer Game");
    }

    PetFood petFood = new PetFood();{
        petFood.foodLocalDate = LocalDateTime.of(2030, Month.JANUARY, 1, 10,
                10, 30);

    }
    Animal animal = new Animal();{
        animal.name = "Lucky";
        animal.age = 5;
        animal.favoriteFoodName = "Royal";
    }
}