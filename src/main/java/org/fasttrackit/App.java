package org.fasttrackit;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Animal Rescuer Game");

            Animal animal = new Animal();{
                animal.name = "Lucky";
                animal.age = 5;
                animal.favoriteFoodName = "Royal";
                System.out.println("Hello,! i'm Lucky , your new friend!");
            }

            PetFood petFood = new PetFood();
            {
                petFood.foodLocalDate = LocalDateTime.of(2030, Month.JANUARY, 1, 10,
                        10, 30);
                System.out.println("My favorite food is delicious!");
            }
        }
    }